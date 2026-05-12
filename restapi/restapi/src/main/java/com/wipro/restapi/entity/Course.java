package com.wipro.restapi.entity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="course1")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int courseId;
	
	@Column(name="title")
	String title;
	
	@Column(name="duration")
	String duration;
	
	@Column(name="fees")
	double fees;
	
	@OneToMany(mappedBy = "course",
	        cascade = CascadeType.ALL,
	        fetch = FetchType.LAZY)
	@JsonManagedReference
	List<Student> students;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", title=" + title + ", duration=" + duration
				+ ", fees=" + fees + "]";
	}
}