package com.wipro.studentreg.mobilerepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.studentreg.entity.Employee;



public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
    List<Employee> findByName(String name);

}