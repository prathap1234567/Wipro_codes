package com.wipro.restapi.serviceimpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.restapi.entity.Student;
import com.wipro.restapi.repo.StudentRepo;
import com.wipro.restapi.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepo studentRepo;
	
	@Override
	public Student findById(int id) {

		Optional<Student> opt = studentRepo.findById(id);
		
		if(opt.isPresent())
		{
			return opt.get();
		}
		
		return null;
	}

	@Override
	public List<Student> findAll() {
		return studentRepo.findAll();
	}

	@Override
	public void save(Student student) {
		studentRepo.save(student);
	}

	@Override
	public void deleteById(int id) {
		studentRepo.deleteById(id);
	}

	@Override
	public List<Student> findByCity(String city) {
		return studentRepo.findByCity(city);
	}
}