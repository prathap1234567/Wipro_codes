package com.wipro.service;
import java.util.ArrayList;

public class EmployeeService {
    ArrayList<Employee> empList=new ArrayList<>();
    public void addEmployee(Employee e){
        empList.add(e);
    }
    public void displayEmployees(){
        for (Employee e : empList){
            System.out.println(e);
        }
    }
    public void searchEmployee(int id) {
        boolean found=false;
        for (Employee e : empList){
            if (e.getId()==id) {
                System.out.println("Search Result ");
                System.out.println(e);
                found= true;
            }
        }
        if (!found){
            System.out.println("Employee Not Found");
        }
    }
}