package com.university;

public class Student {

	private String name, fName, gFName, dateOfBirth, faculty, emailAddress;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Student(String name, String fName, String gFName,
			String dateOfBirth, String faculty) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.fName = fName;
		this.gFName = gFName;
		this.dateOfBirth = dateOfBirth;
		this.faculty = faculty;
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

	public String getgFName() {
		return gFName;
	}

	public void setgFName(String gFName) {
		this.gFName = gFName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

}
