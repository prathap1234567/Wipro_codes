package com.wipro.restapi.service;

import java.util.List;

import com.wipro.restapi.entity.Student;


public interface StudentService {

	Student findById(int id);
	List<Student> findAll();
	void save(Student student);
	void deleteById(int id);
	List<Student> findByCity(String city);
}