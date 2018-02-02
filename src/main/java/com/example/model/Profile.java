package com.example.model;

import javax.persistence.*;

@Entity
@Table(name="user_profile")
public class Profile {
	
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private int eId;
	private String name;
	private String lastName;
	private String phone;
	private String address;
	
	@OneToOne
	private User user;
	
	public Profile(int eId, String name, String lastName, String phone,String address, User user) {
		super();
		this.eId = eId;
		this.name = name;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
		this.user = user;
	}

	public int getId() {
		return eId;
	}

	public void setId(int id) {
		this.eId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
