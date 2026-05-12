package com.wipro.restdemo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import com.wipro.restdemo.entity.Employee;
import com.wipro.restdemo.repo.EmployeeRepo;
import com.wipro.restdemo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public List<Employee> findAll() {
		return employeeRepo.findAll(Sort.by(Sort.Direction.DESC,"employeeId"));
	}

	@Override
	public Optional<Employee> findById(int id) {
		return employeeRepo.findById(id);
	}

	@Override
	public String update(Employee e) {
		employeeRepo.save(e);
		return "data updated";
	}

	@Override
	public void deleteById(int id) {
		employeeRepo.deleteById(id);
	}

	@Override
	public void save(Employee e) {
		employeeRepo.save(e);
	}

	@Override
	public List<Employee> findByDepartment(String dept) {
		return employeeRepo.findByDepartment(dept);
	}

	@Override
	public List<Employee> findBySalaryGreaterThan(double salary) {
		return employeeRepo.findBySalaryGreaterThan(salary);
	}

	@Override
	public List<Employee> findByNameContaining(String name) {
		return employeeRepo.findByEmployeeNameContaining(name);
	}

	@Override
	public Page<Employee> findAllByPage(Pageable p) {
		return employeeRepo.findAll(p);
	}
}