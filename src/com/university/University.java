package com.university;

import java.util.ArrayList;

public abstract class University {

	ArrayList<Student> attendance;

	public University() {
		// TODO Auto-generated constructor stub
		attendance = new ArrayList<Student>();
	}

	public void addToAttendance(Student student) {
		attendance.add(student);
	}

	public abstract void createCreditSheet();

	public void makeEmailAddress() {
		Student student = attendance.get(attendance.size() - 1);

		if (student.getFaculty().equals("LAW")) {
			student.setEmailAddress(student.getfName() + "LAW.edu.af");
		} else if (student.getFaculty().equals("Economics")) {
			student.setEmailAddress(student.getfName() + "Economics.edu.af");
		} else if (student.getFaculty().equals("CS")) {
			student.setEmailAddress(student.getfName() + "CS.edu.af");
		} else {
			System.out
					.println(" you've not set your faculty go set your faculty and then come back");
		}

	}

}
