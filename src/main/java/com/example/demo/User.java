package com.example.demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private Long id;
	private String userName;
	private String password;
	
	@OneToOne(fetch = FetchType.LAZY,cascade =  CascadeType.ALL,mappedBy = "user")
	private Profile profile;	
	
	public User() 
	{}	
	public User(Long id)
	{ 
		this.id = id;
	}
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password="
				+ password + "]";
	}
	
	

}
