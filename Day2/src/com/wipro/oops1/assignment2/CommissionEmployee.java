package com.wipro.oops1.assignment2;

public class CommissionEmployee extends Employee {

    private double salesMade;
    private double commissionRate;

    public CommissionEmployee(String name, String employeeId, double baseSalary,
                              double salesMade, double commissionRate) {
        super(name, employeeId, baseSalary); 
        this.salesMade = salesMade;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (salesMade * commissionRate);
    }

    @Override
    public String getJobTitle() {
        return "Commission Employee";
    }
}
