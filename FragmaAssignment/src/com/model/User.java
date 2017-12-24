package com.model;

public class User {
	private int userId;
	private String gender;
	private int age;
	private String occupation;
	private String zipcode;
	
	public User() {
		
	}

	public User(int userId, String gender, int age, String occupation, String zipcode) {
		super();
		this.userId = userId;
		this.gender = gender;
		this.age = age;
		this.occupation = occupation;
		this.zipcode = zipcode;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	



}
