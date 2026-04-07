package com.cleancode.ch03_functions.dirty;

import java.util.ArrayList;
import java.util.List;

public class Payroll {
    public enum EmployeeType {
        SALARIED, HOURLY, COMMISSIONED
    }

    public record Employee(
            String id,
            EmployeeType type,
            double monthlySalary,
            double hourlyRate,
            int hoursWorked,
            double salesAmount,
            boolean payday) {
    }

    private final List<String> auditTrail = new ArrayList<>();

    public double process(Employee employee) {
        double grossPay;

        switch (employee.type()) {
            case SALARIED:
                grossPay = employee.monthlySalary();
                break;
            case HOURLY:
                int regularHours = Math.min(employee.hoursWorked(), 160);
                int overtimeHours = Math.max(0, employee.hoursWorked() - 160);
                grossPay = (regularHours * employee.hourlyRate()) + (overtimeHours * employee.hourlyRate() * 1.5);
                break;
            case COMMISSIONED:
                grossPay = employee.monthlySalary() + (employee.salesAmount() * 0.10);
                break;
            default:
                throw new IllegalArgumentException("Invalid employee type: " + employee.type());
        }

        if (employee.payday()) {
            auditTrail.add("DELIVER_PAY:" + employee.id() + ":" + grossPay);
            sendToBank(employee.id(), grossPay);
        }

        auditTrail.add("PROCESSED:" + employee.id() + ":" + employee.type());
        return grossPay;
    }

    private void sendToBank(String employeeId, double amount) {
        auditTrail.add("BANK_TRANSFER:" + employeeId + ":" + amount);
    }

    public List<String> auditTrail() {
        return List.copyOf(auditTrail);
    }
}

