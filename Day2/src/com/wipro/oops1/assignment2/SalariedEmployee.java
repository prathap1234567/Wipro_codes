package com.wipro.oops1.assignment2;


public class SalariedEmployee extends Employee {

    private double monthlySalary;

    public SalariedEmployee(String name, String employeeId, double baseSalary, double monthlySalary) {
        super(name, employeeId, baseSalary); 
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public String getJobTitle() {
        return "Salaried Employee";
    }
}