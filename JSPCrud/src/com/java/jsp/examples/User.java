package com.java.jsp.examples;

public class User {
	private int id;  
	private String name,password,email,sex,country;  
	
	public int getId() {
		return id;
	}
	public void setId(int newId) {
	id = newId;
	}
	public String getName() {
		return name;
		
	}
	public void setName(String newName) {
		name = newName;
	}
	public String getPassword() {
		
		return password;
	}
	
	public void setPassword(String newPassword) {
		password = newPassword;
	}
	public String getEmail() {
		
		return email;
	}
	public void setEmail(String newEmail) {
		password = newEmail;
	}
	public String getSex() {
		
		return sex;
	}
	public void setSex(String newSex) {
		password = newSex;
	}
	public String getCountry() {
		
		return country;
	}
	public void setCountry(String newCountry) {
		password = newCountry;
	}
}
