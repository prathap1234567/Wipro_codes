package com.wipro.oops1.assignment2;

abstract class Employee {
    private String name;
    private String employeeId;
    private double baseSalary;
    public Employee(String name, String employeeId, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateSalary();

    public abstract String getJobTitle();

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + employeeId;
    }
}
