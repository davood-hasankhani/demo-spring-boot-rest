package com.example.demo;

import javax.persistence.*;

@Entity
public class Profile {
	
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private Long eId;
	private String name;
	private String phone;
	private String address;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
	private User user;
	
	public Profile(){}
	public Profile(Long id)
	{ 
		this.eId = id;
	}
	
	public Profile( String name, String phone,String address) 
	{
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public Long getId() {
		return eId;
	}

	public void setId(Long id) {
		this.eId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
