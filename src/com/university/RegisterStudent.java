package com.university;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class RegisterStudent {

	public void registerStudent(Student student) {
		University faculty = null;
		if (student.getFaculty().equals(" Economic ")) {
			faculty = (Economics) new Economics();
		} else if (student.getFaculty().equals("LAW")) {
			faculty = (LAW) new LAW();
		} else if (student.getFaculty().equals("CS")) {
			faculty = (CS) new CS();
		} else {
			JOptionPane.showMessageDialog(null,
					" please choose a faculty Name ");
		}
		faculty.addToAttendance(student);
		faculty.createCreditSheet();
		faculty.makeEmailAddress();

	}

}
