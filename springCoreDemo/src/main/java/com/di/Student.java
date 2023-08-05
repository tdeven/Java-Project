package com.di;

public class Student {

	private int id;
	private String fname;
	private String lname;
	private int roll;
	
	public Student(int id, String fname, String lname, int roll) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.roll = roll;
	}

	@Override
	public String toString() {
		

		
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", roll=" + roll + "]";
	}
	
	
	
}
