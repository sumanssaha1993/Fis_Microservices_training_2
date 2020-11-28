package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private Integer id;
	private String name;
	private String pincode;
	
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", pincode=" + pincode + "]";
	}
	
}
