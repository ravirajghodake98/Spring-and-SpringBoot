package com.cg.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human 
{
	private Heart h;
	
	public Human() {
		this.h = h;
	}
	
	public Human(Heart h) {
		super();
		this.h = h;
	}

	@Autowired
	@Qualifier("h")
	public void setH(Heart h) {
		this.h = h;
	}

	public void display()
	{
		h.pump();
		System.out.println("The name of animal is: " +h.getNameOfAnimal()+ " and no. of heart is: " +h.getNoOfHeart());
	}
}
