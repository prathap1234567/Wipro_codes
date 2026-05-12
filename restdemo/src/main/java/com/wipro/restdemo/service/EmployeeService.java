package com.wipro.restdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wipro.restdemo.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();
	Optional<Employee> findById(int id);
	String update (Employee e);
	void deleteById(int id);
	void save(Employee e);
	List<Employee> findByDepartment(String dept);
	List<Employee> findBySalaryGreaterThan(double salary);
	List<Employee> findByNameContaining(String name);
	Page<Employee> findAllByPage(Pageable p);
}