package com.module;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class student {
	@Id
	@Column(name="id")
	int id;
	@Column(name="name")
	String name;
	@Column(name="email")
	String email;
	@Column(name="dept")
	String department;
	@Column(name="percentage")
	int percentage;

	public student() {
		
	}

	public student(int id, String name, String email, String department, int percentage) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
		this.percentage = percentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	
	public String toString() {
		return id +","+ name+";"+email+","+department+","+percentage;
	}
	
	
	
	

}
