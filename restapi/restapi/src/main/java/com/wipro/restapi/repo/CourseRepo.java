package com.wipro.restapi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.restapi.entity.Course;


@Repository
public interface CourseRepo extends JpaRepository<Course, Integer>{

	List<Course> findByFeesLessThan(double fees);
}