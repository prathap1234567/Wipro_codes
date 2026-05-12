package com.wipro.oops1.assignment2;
public class HourlyEmployee extends Employee {

    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(String name, String employeeId, double baseSalary,
                          double hoursWorked, double hourlyRate) {
        super(name, employeeId, baseSalary); 
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String getJobTitle() {
        return "Hourly Employee";
    }
}
