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

import com.wipro.restapi.entity.Course;
import com.wipro.restapi.entity.Student;
import com.wipro.restapi.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	CourseService courseService;	
	@GetMapping
	List<Course>findAll()
	{
		return courseService.findAll();
	}
	@GetMapping("/{id}")
	Course findById(@PathVariable int id)
	{
		return courseService.findById(id);
	}
	@PostMapping
	String saveCourse(@RequestBody Course course)
	{
		course.setCourseId(0);
		courseService.save(course);
		
		return "Course Added Successfully";
	}
	
	@PutMapping("/{id}")
	String updateCourse(@RequestBody Course course)
	{
		courseService.save(course);
		
		return "Course Updated Successfully";
	}
	@DeleteMapping("/{id}")
	String deleteCourseById(@PathVariable int id)
	{
		courseService.deleteById(id);
		
		return "Course Deleted Successfully";
	}
	
	@GetMapping("/fees/{fees}")
	List<Course> findByFeesLessThan(@PathVariable double fees)
	{
		return courseService.findByFeesLessThan(fees);
	}
	
	@GetMapping("/{id}/students")
	List<Student> getStudents(@PathVariable int id)
	{
		return courseService.findById(id).getStudents();
	}
}