package com.wipro.restdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import com.wipro.restdemo.entity.Employee;
import com.wipro.restdemo.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController{
	@Autowired
	EmployeeService employeeService;
	@GetMapping
	List<Employee> getEmployee(){
		return employeeService.findAll();
	}

	@GetMapping("/{id}")
	Employee findById(@PathVariable int id) {
		Optional<Employee> opt=employeeService.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			return new Employee();
		}
	}

	@PutMapping
	String putEmployee(@RequestBody Employee e) {
		return employeeService.update(e);
	}

	@PostMapping
	String postEmployee(@RequestBody Employee e) {
		e.setEmployeeId(0);
		employeeService.save(e);
		return "Added Successfully";
	}

	@DeleteMapping("/{id}")
	String deleteEmployee(@PathVariable int id) {
		employeeService.deleteById(id);
		return "Deleted Successfully";
	}

	@GetMapping("/dept")
	List<Employee> findByDept(@RequestParam(name="d") String dept){
		return employeeService.findByDepartment(dept);
	}

	@GetMapping("/salary")
	List<Employee> findBySalary(@RequestParam(name="s") double salary){
		return employeeService.findBySalaryGreaterThan(salary);
	}

	@GetMapping("/name")
	List<Employee> findByName(@RequestParam("n") String name){
		return employeeService.findByNameContaining(name);
	}

	@GetMapping("/pg")
	public Page<Employee> findAllByPage(
			@RequestParam("pn")int pageNumber,@RequestParam("sz") int pageSize,@RequestParam("srt") String sortDir)
	{
		Sort sort=null;

		if(sortDir.equalsIgnoreCase("a")){
			sort=Sort.by("employeeId").ascending();
		}
		else{
			sort=Sort.by("employeeId").descending();
		}
		System.out.println(sort);

		Pageable p=PageRequest.of(pageNumber, pageSize).withSort(sort);

		return employeeService.findAllByPage(p);
	}
}