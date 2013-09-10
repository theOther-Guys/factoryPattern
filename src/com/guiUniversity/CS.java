package com.guiUniversity;

import java.util.ArrayList;

public class CS extends University{
	
	static ArrayList<Subject> subjects = new ArrayList<Subject>();

	public CS() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public void addSubjects (Subject subject){
		if (subject instanceof Subject){
		subjects.add(subject);
		}else 
			System.out.println("wrong input ");
	}
	public ArrayList<Students> getStudents (){
		return student;
	}
	public ArrayList<Subject> getSubjects (){
		return subjects ;
	}
	
}
