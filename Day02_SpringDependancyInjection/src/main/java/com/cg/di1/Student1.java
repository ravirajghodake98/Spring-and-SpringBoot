package com.cg.di1;

//Spring Dependancy in terms of objects
public class Student1 
{
	Cheat c;
	
//	DI using setters
	public void setC(Cheat c) {
		this.c = c;
	}

	

	public void cheating()
	{
		c.mathCheat();
	}

}
