package com.guiUniversity;

import javax.swing.JOptionPane;

public class Register extends University{
	
	private University faculties ;
	
	public Register() {
		// TODO Auto-generated constructor stub
		super();
	}
	public void registerStudent (Students student){
		
		if (student.getFacultyName().equals("Economics")){
			faculties = (Economics )new Economics();
		}else if (student.getFacultyName().equals("LAW")){
			faculties = (LAW)new LAW();
		}else if (student.getFacultyName().equals("CS")){
			faculties = (CS) new CS();
		}else {
			JOptionPane.showMessageDialog(null, " please select which faculty you apply for ");
		}
		
		faculties.registerStudent(student);
		faculties.addToAttendance();
		faculties.createEmailAddress();
		
	}

}
