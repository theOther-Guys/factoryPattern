package com.guiUniversity;

public class Subject {
	
	private String name ;
	private int credit  , semester ;
	public Subject(String name, int credit , int semester) {
		// TODO Auto-generated constructor stub
		this.name = name ;
		this.credit = credit ;
		this.semester = semester;
	}
	public Subject (String name , int credit ){
		this.name = name ;
		this.credit = credit ;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
