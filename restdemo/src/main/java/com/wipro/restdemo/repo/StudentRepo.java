package com.wipro.restdemo.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.wipro.restdemo.entity.StudentResult;

@Repository
public class StudentRepo {

	List<StudentResult> listStudent=new ArrayList<>();
	public StudentRepo() {
		super();
		listStudent.add(new StudentResult(1,"Prathap","Java",85));
		listStudent.add(new StudentResult(2,"Rahul","Python",75));
		listStudent.add(new StudentResult(3,"Sneha","Java",90));
	} 
	public List<StudentResult> findAll(){
		return listStudent;
	}
	public Optional<StudentResult> findById(int id){
		return listStudent
				.stream()
				.filter(s->s.getId()==id)
				.findFirst();
	}
	public void save(StudentResult s) {
		listStudent.add(s);
	}
	public void deleteById(int id){
		    listStudent=listStudent
				.stream()
				.filter(s->s.getId()!=id)
				.toList();
		System.out.println(listStudent);
	}
	public String update(StudentResult s) {
		for(int i=0;i<listStudent.size();i++) {
			if(s.getId()==listStudent.get(i).getId()) {
				listStudent.set(i, s);
				return "Updated Successfully";
			}
		}
		return "Student Doesn't exist";
	}
	public List<StudentResult> above80(){
		return listStudent
				.stream()
				.filter(s->s.getMarks()>80)
				.toList();
	}
	public List<StudentResult> sortByMarks(){
		return listStudent
				.stream()
				.sorted((a,b)->a.getMarks()-b.getMarks())
				.toList();
	}
}