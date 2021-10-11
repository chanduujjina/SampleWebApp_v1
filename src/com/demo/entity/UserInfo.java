package com.demo.entity;

public class UserInfo {
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public UserInfo(String userName, String password, String gender,String phoneNumber,String email) {
		super();
		this.userName = userName;
		this.password = password;
		
		this.gender = gender;
		this.phoneNumber =phoneNumber; 
		this.email = email;
	}

	private String userName;
	
	private String password;
	
	private String gender;
	
	private String phoneNumber;
	
	private String email;
	

}
