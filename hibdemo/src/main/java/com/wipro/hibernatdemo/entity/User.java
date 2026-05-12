package com.wipro.hibernatdemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="username")
	private String username;
	@Column(name="email")
	private String email;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "profile_id")
	private UserProfile profile;
	
	public User() {}
	public User(String username, String email, UserProfile profile) {
		super();
		this.username = username;
		this.email = email;
		this.profile = profile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public UserProfile getProfile() {
		return profile;
	}
	public void setProfile(UserProfile profile) {
		this.profile = profile;
	}
	
	public void displayUserDetails() {
		System.out.println("Username: "+this.username);
		System.out.println("Email: "+this.email);
		if(this.profile != null) {
			System.out.println("Phone: "+this.profile.getPhone());
			System.out.println("Address: "+this.profile.getAddress());
			System.out.println("Gender: "+this.profile.getGender());
		} else {
			System.out.println("Profile: No profile linked with this!");
		}
		System.out.println("-------------------------");
	}
}
