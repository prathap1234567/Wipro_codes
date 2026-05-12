package com.wipro.oops1.assignment2;

public class PayrollSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new SalariedEmployee("Prathap", "E101", 30000, 50000);
		Employee emp2 = new HourlyEmployee("Kumar", "E102", 0, 160, 200);
		Employee emp3 = new CommissionEmployee("Ravi", "E103", 20000, 50000, 0.10);
		
		System.out.println(emp1 + ", Job: " + emp1.getJobTitle() + ", Salary: " + emp1.calculateSalary());
		System.out.println(emp2 + ", Job: " + emp2.getJobTitle() + ", Salary: " + emp2.calculateSalary());
		System.out.println(emp3 + ", Job: " + emp3.getJobTitle() + ", Salary: " + emp3.calculateSalary());
	}

}

	
