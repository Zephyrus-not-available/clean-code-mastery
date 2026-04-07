package com.cleancode.ch03_functions.clean;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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

    public interface PayStrategy {
        double calculate(Employee employee);
    }

    public interface PayStrategyFactory {
        PayStrategy forType(EmployeeType type);
    }

    private final PayStrategyFactory strategyFactory;
    private final List<String> auditTrail = new ArrayList<>();

    public Payroll(PayStrategyFactory strategyFactory) {
        this.strategyFactory = Objects.requireNonNull(strategyFactory, "strategyFactory must not be null");
    }

    public double process(Employee employee) {
        PayStrategy strategy = strategyFactory.forType(employee.type());
        double grossPay = strategy.calculate(employee);

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

    public static final class DefaultPayStrategyFactory implements PayStrategyFactory {
        private final Map<EmployeeType, PayStrategy> strategies = new EnumMap<>(EmployeeType.class);

        public DefaultPayStrategyFactory() {
            strategies.put(EmployeeType.SALARIED, employee -> employee.monthlySalary());
            strategies.put(EmployeeType.HOURLY, employee -> {
                int regularHours = Math.min(employee.hoursWorked(), 160);
                int overtimeHours = Math.max(0, employee.hoursWorked() - 160);
                return (regularHours * employee.hourlyRate()) + (overtimeHours * employee.hourlyRate() * 1.5);
            });
            strategies.put(EmployeeType.COMMISSIONED, employee -> employee.monthlySalary() + (employee.salesAmount() * 0.10));
        }

        @Override
        public PayStrategy forType(EmployeeType type) {
            PayStrategy strategy = strategies.get(type);
            if (strategy == null) {
                throw new IllegalArgumentException("No strategy registered for employee type: " + type);
            }
            return strategy;
        }
    }
}

