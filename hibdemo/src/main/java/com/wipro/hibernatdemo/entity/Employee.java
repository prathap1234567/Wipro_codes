package com.wipro.hibernatdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")

public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String empployeeName;
	String department;
	double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empployeeName, String department, double salary) {
		super();
		this.empployeeName = empployeeName;
		this.department = department;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [  empployeeName=" + empployeeName + ", department=" + department + ", salary="
				+ salary + "]";
	}
	
	public String getEmpployeeName() {
		return empployeeName;
	}
	public void setEmpployeeName(String empployeeName) {
		this.empployeeName = empployeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
