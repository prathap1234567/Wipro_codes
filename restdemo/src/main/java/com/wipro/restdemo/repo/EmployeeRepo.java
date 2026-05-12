package com.wipro.restdemo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.restdemo.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

	List<Employee> findByDepartment(String department);
	List<Employee> findBySalaryGreaterThan(double salary);
	List<Employee> findByEmployeeNameContaining(String name);

}