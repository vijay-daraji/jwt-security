package com.vijay.springsecuritylearn.auth;

public class RegisterRequest {
	
	private String firstname;
	private String lastname;
	private String email;
	private String password;
		
	public RegisterRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public RegisterRequest(String firstname, String lastname, String email, String password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String fristname) {
		this.firstname = fristname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
