package com.RESTful.RESTfulApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String email;
	private String phone;
	  
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}
	public String getPhone() {
		// TODO Auto-generated method stub
		return phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
		
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}