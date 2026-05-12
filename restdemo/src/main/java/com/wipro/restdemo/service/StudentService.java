package com.wipro.restdemo.service;

import java.util.List;
import java.util.Optional;

import com.wipro.restdemo.entity.StudentResult;

public interface StudentService {

	List<StudentResult> findAll();
	Optional<StudentResult> findById(int id);
	String update (StudentResult s);
	void deleteById(int id);
	void save(StudentResult s);
	List<StudentResult> above80();
	List<StudentResult> sortByMarks();
}