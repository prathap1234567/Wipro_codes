package com.wipro.restdemo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.restdemo.entity.StudentResult;
import com.wipro.restdemo.repo.StudentRepo;
import com.wipro.restdemo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Autowired
	StudentRepo studentRepo;

	@Override
	public List<StudentResult> findAll() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public Optional<StudentResult> findById(int id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id);
	}

	@Override
	public String update(StudentResult s) {
		// TODO Auto-generated method stub
		return studentRepo.update(s);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
		
	}

	@Override
	public void save(StudentResult s) {
		// TODO Auto-generated method stub
		studentRepo.save(s);
		
	}

	@Override
	public List<StudentResult> above80() {
		return studentRepo.above80();
	}

	@Override
	public List<StudentResult> sortByMarks() {
		return studentRepo.sortByMarks();
	}

}