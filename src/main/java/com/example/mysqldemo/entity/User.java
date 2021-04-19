package com.example.mysqldemo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;

import com.sun.istack.NotNull;

@Entity

public class User {
	@GeneratedValue()
	@Id
	private Integer id;
	@NotNull
	private String name;
	@Email
    private String email;
    private long phoneNumber;
    private Date DOB;
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dob) {
		if(dob.compareTo(new Date())<0) {
			throw new IllegalArgumentException("DOB cannot be future dates");
		}
		this.DOB = dob;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
