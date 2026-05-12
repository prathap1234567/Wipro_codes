package com.wipro.homeassignment;

public class StudentRegDto {
	private String name;
	private String course;
	private String language;
	public StudentRegDto(String name, String course, String language) {
		super();
		this.name = name;
		this.course = course;
		this.language = language;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "StudentRegDto [name=" + name + ", course=" + course + ", language=" + language + "]";
	}

}
