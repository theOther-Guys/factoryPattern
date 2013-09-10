package com.university;

import java.util.ArrayList;

public class CS extends University {

	static ArrayList<Subject> subjects = new ArrayList<Subject>();
	ArrayList<Student> attendace = new ArrayList<Student>();

	public CS() {

	}

	@Override
	public void createCreditSheet() {
		// TODO Auto-generated method stub
		Student student = attendance.get(attendance.size() - 1);
		System.out.println(student.getfName() + "\t" + student.getfName()
				+ "\t" + student.getgFName() + "\t");

		System.out.println("Subjects : ");
		for (int i = 0; i < subjects.size(); i++) {
			System.out.println(subjects.get(i).getName() + "\t"
					+ subjects.get(i).getCredit());
		}
	}

	public void addSubjects(Subject subject) {
		subjects.add(subject);
	}

	public void removeSubject(Subject subject) {
		subjects.remove(subject);
	}

}
