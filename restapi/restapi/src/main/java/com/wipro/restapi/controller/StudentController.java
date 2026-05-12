package com.wipro.restapi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.restapi.entity.Student;
import com.wipro.restapi.service.StudentService;

import io.swagger.v3.oas.annotations.Operation;
@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping
	List<Student> findAll()
	{
		return studentService.findAll();
		
	}
	
	
	@GetMapping("/{id}")
	Student findById(@PathVariable int id)
	{
		return studentService.findById(id);
	}
	
	@PostMapping
	String saveStudent(@RequestBody Student student)
	{
		student.setStudentId(0);
		studentService.save(student);
		return "Student Added Successfully";
	}
	
	@PutMapping("/{id}")
	String updateStudent(@RequestBody Student student)
	{
		studentService.save(student);

		return "Student Updated Successfully";
	}
	
	@DeleteMapping("/{id}")
	String deleteStudentById(@PathVariable int id)
	{
		studentService.deleteById(id);
		return "Student Deleted Successfully";
	}
	
	@GetMapping("/city/{city}")
	List<Student> findByCity(@PathVariable String city)
	{
		return studentService.findByCity(city);
	}
}
