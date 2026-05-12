package com.wipro.restapi.serviceimpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.restapi.entity.Course;
import com.wipro.restapi.repo.CourseRepo;
import com.wipro.restapi.service.CourseService;



@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	CourseRepo courseRepo;
	
	@Override
	public Course findById(int id) {

		Optional<Course> opt = courseRepo.findById(id);
		
		if(opt.isPresent())
		{
			return opt.get();
		}
		
		return null;
	}

	@Override
	public List<Course> findAll() {
		return courseRepo.findAll();
	}

	@Override
	public void save(Course course) {
		courseRepo.save(course);
	}

	@Override
	public void deleteById(int id) {
		courseRepo.deleteById(id);
	}

	@Override
	public List<Course> findByFeesLessThan(double fees) {
		return courseRepo.findByFeesLessThan(fees);
	}
}