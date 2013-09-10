package com.guiUniversity;

public class Students {
	
	private String name , fName , facultyName, emailAddress;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Students(String name, String fName, String facultyName) {
		// TODO Auto-generated constructor stub
	this.name = name ;
	this.fName = fName ;
	this.facultyName = facultyName ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	

}
