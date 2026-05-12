package com.wipro.d6_assignment_q2_prathap_kandasamy;

public class Employee {
	int id;
	String name;
	String department;
	double salary;
	int age;
	public Employee(int id, String name, String department, double salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + ", age="
				+ age + "]";
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}