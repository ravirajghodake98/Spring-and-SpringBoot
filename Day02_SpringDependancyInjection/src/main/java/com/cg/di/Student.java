package com.cg.di;

public class Student
{
	private String StudentName;
	private int id;
	
	//using constructor	
	public Student(String studentName, int id) {
		super();
		StudentName = studentName;
		this.id = id;
	}
	//using setters injection
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void display()
	{
		System.out.println("Name of the student is: " +StudentName+ " and ID is: " +id);
	}

	
}
