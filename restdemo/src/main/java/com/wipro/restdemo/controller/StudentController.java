package com.wipro.restdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.restdemo.entity.StudentResult;
import com.wipro.restdemo.service.StudentService;

@RestController
@RequestMapping("/results")
public class StudentController {
	@Autowired
	StudentService studentService;
			@GetMapping
				 List<StudentResult> getStudent(){
				return studentService.findAll();
			}
		@GetMapping("/{id}")
		StudentResult findById(@PathVariable int id) {
			Optional<StudentResult> opt=studentService.findById(id);
			if (opt.isPresent()) {
				return opt.get();
			} else {
				return new StudentResult();
			}
		
		}

	@PutMapping
	String putStudent(@RequestBody StudentResult s) {
		  return studentService.update(s);
	}
	@PostMapping
	String postStudent(@RequestBody StudentResult s) {
		studentService.save(s);
		  return "Added Successfully";
	}
	@DeleteMapping("/{id}")
	String deleteStudent(@PathVariable int id) {
		studentService.deleteById(id);
		  return "Deleted Successfully";
	}

	@GetMapping("/above80")
	List<StudentResult> above80(){
		return studentService.above80();
	}

	@GetMapping("/sort")
	List<StudentResult> sort(){
		return studentService.sortByMarks();
	}
}