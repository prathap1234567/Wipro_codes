package com.wipro.hibernatdemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="user_profile") 

public class UserProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="phone")
	private String phone;
	@Column(name="address")
	private String address;
	@Column(name="gender")
	private String gender;
	
	public UserProfile() {}
		public UserProfile(String phone,String address, String gender) {
			this.phone = phone;
			this.address = address;
			this.gender = gender;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		
	}
