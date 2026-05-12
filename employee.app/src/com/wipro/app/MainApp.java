package com.wipro.app;

import com.wipro.service.Employee;
import com.wipro.service.EmployeeService;

public class MainApp {
    public static void main(String[] args) {
        EmployeeService service=new EmployeeService();
        service.addEmployee(new Employee(1,"Prathap","HR",70000));
        service.addEmployee(new Employee(2, "Harish", "Admin", 50000));
        System.out.println("Employee List ");
        service.displayEmployees();
        service.searchEmployee(2);
    }
}