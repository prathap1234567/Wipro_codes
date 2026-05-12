package com.wipro.d6_assignment_q1_prathap_kandasamy;

import java.util.ArrayList;
import java.util.List;

public class Test1{
		// TODO Auto-generated method stub
		static List<Employee> filter(List<Employee>list,EmployeeFilter f){
			List<Employee> result=new ArrayList<>();
			for(Employee e:list) {
				if(f.test(e)){
					result.add(e);
				}
			}
			return result;
		}
		public static void main(String[] args) {
		List<Employee> list1= new ArrayList<>();
		Employee e1 = new Employee("Arjun", 25, 40000);
		Employee e2 = new Employee("Bharath", 30, 60000);
		Employee e3 = new Employee("Charan", 28, 55000);
		Employee e4 = new Employee("Deepak", 35, 45000);
		Employee e5 = new Employee("Eshwar", 26, 70000);
		Employee e6 = new Employee("Farhan", 32, 52000);
		Employee e7 = new Employee("Gokul", 29, 48000);
		Employee e8 = new Employee("Hari", 40, 80000);
		Employee e9 = new Employee("Ishaan", 27, 30000);
		Employee e10 = new Employee("Jeeva", 31, 65000);

		list1.add(e1);
		list1.add(e2);
		list1.add(e3);
		list1.add(e4);
		list1.add(e5);
		list1.add(e6);
		list1.add(e7);
		list1.add(e8);
		list1.add(e9);
		list1.add(e10);
		
		List<Employee> res=filter(list1,e->e.salary>50000);
		res.forEach(System.out::println);
		
	}

}
