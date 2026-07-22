package com.sri.comstructor;

public class Employee {

	private Object details;
	
	private String role;
	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Object getDetails() {
		return details;
	}

	public void setDetails(Object details) {
		this.details = details;
	}
	
	public String toString() {
		return String.format("{\"details\":%s, \"role\" : \"%s\"}", details , role);
	}
}
