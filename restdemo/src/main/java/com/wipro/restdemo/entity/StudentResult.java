package com.wipro.restdemo.entity;

public class StudentResult {
	
	int id;
	String name;
	String subject;
	int marks;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentResult [id=" + id + ", name=" + name + ", subject=" + subject + ", marks=" + marks + "]";
	}

	public StudentResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentResult(int id, String name, String subject, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.marks = marks;
	}

}