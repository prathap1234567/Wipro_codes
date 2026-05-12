package com.wipro.restapi.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="student1")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int studentId;
	
	@Column(name="student_name")
	String studentName;
	
	@Column(name="email")
	String email;
	
	@Column(name="city")
	String city;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="course_id")
	@JsonBackReference
	Course course;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", email="
				+ email + ", city=" + city + "]";
	}
}
