package com.wipro.d6_assignment_q2_prathap_kandasamy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees=new ArrayList<>();
		Employee e1 = new Employee(1, "Ram", "IT", 60000, 28);
        Employee e2 = new Employee(2, "Shyam", "HR", 40000, 32);
        Employee e3 = new Employee(3, "Amit", "IT", 70000, 26);
        Employee e4 = new Employee(4, "Ravi", "Finance", 50000, 35);
        Employee e5 = new Employee(5, "Ankit", "IT", 30000, 24);
        Employee e6 = new Employee(6, "Neha", "HR", 45000, 29);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        List<Employee> highsalary=employees
        		.stream()
        		.filter(e->e.salary>50000)
        		.collect(Collectors.toList());
        System.out.println("Highest salary");
        highsalary.forEach(System.out::println);
        List<Employee> sorted=employees
        		.stream()
        		.sorted((Comparator.comparingDouble(e->((Employee) e).getSalary()).reversed()))
        		.collect(Collectors.toList());
        System.out.println(" Sorted ");
        sorted.forEach(System.out::println);
        List<String>names=employees.
        		stream()
                .map(e -> e.name)
                .collect(Collectors.toList());

        System.out.println("Employee Names");
        names.forEach(System.out::println);
        

	}

}
