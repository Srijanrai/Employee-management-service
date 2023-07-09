package com.fullstack.model;


public class Employee {

	private Long id;
	private String firstName;
	private String lastName;
	private String emailId;
	
	public Employee(Long id2, String firstName2, String lastName2, String emailId2) {
		// TODO Auto-generated constructor stub
		this.id=id2;
		this.firstName=firstName2;
		this.lastName=lastName2;
		this.emailId=emailId2;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		//System.out.println(lastName);
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
