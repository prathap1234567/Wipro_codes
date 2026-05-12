package com.wipro.restapi.service;

import java.util.List;

import com.wipro.restapi.entity.Course;


public interface CourseService {

	Course findById(int id);
	List<Course> findAll();
	void save(Course course);
	void deleteById(int id);
	List<Course> findByFeesLessThan(double fees);
}