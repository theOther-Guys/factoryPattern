package com.guiUniversity;

import java.util.ArrayList;

public class University {

	public static ArrayList<Students> student;

	public static ArrayList<Students> attendance;

	public University() {
		// TODO Auto-generated constructor stub
		student = new ArrayList<Students>();
		attendance = new ArrayList<Students>();
		
		student.add(new Students("ali", "qadir", "LAW"));
		attendance.add(new Students("ali", "moh", "LAW"));
	}

	public void registerStudent(Students stud) {
		student.add(stud);
		//attendance.add(stud);
		addToAttendance();
	}

	public void addToAttendance() {
		Students stud = student.get(student.size() - 1);
		attendance.add(stud);
		createEmailAddress();
	}

	public void createEmailAddress() {
		Students stud = attendance.get(attendance.size() - 1);

		String emailAddress = stud.getfName() + "@" + "."
				+ stud.getFacultyName() + ".edu.af";
		stud.setEmailAddress(emailAddress);
	}

}
