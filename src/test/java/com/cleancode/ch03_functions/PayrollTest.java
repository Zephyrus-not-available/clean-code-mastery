package com.cleancode.ch03_functions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PayrollTest {

    @Test
    void dirtyPayrollProcessesHourlyEmployeeAndWritesSideEffects() {
        com.cleancode.ch03_functions.dirty.Payroll payroll = new com.cleancode.ch03_functions.dirty.Payroll();
        com.cleancode.ch03_functions.dirty.Payroll.Employee employee =
                new com.cleancode.ch03_functions.dirty.Payroll.Employee(
                        "E-100",
                        com.cleancode.ch03_functions.dirty.Payroll.EmployeeType.HOURLY,
                        0,
                        50,
                        170,
                        0,
                        true
                );

        double grossPay = payroll.process(employee);

        assertThat(grossPay).isEqualTo(8750.0);
        assertThat(payroll.auditTrail()).contains(
                "DELIVER_PAY:E-100:8750.0",
                "BANK_TRANSFER:E-100:8750.0",
                "PROCESSED:E-100:HOURLY"
        );
    }

    @Test
    void cleanPayrollUsesFactoryStrategiesAndProducesExpectedOutput() {
        com.cleancode.ch03_functions.clean.Payroll payroll =
                new com.cleancode.ch03_functions.clean.Payroll(
                        new com.cleancode.ch03_functions.clean.Payroll.DefaultPayStrategyFactory());
        com.cleancode.ch03_functions.clean.Payroll.Employee employee =
                new com.cleancode.ch03_functions.clean.Payroll.Employee(
                        "E-200",
                        com.cleancode.ch03_functions.clean.Payroll.EmployeeType.COMMISSIONED,
                        3000,
                        0,
                        0,
                        20000,
                        true
                );

        double grossPay = payroll.process(employee);

        assertThat(grossPay).isEqualTo(5000.0);
        assertThat(payroll.auditTrail()).contains(
                "DELIVER_PAY:E-200:5000.0",
                "BANK_TRANSFER:E-200:5000.0",
                "PROCESSED:E-200:COMMISSIONED"
        );
    }
}

