package com.cg.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) 
	{
		/*
		 * Agenda of SpringIOC(Inversion of Control) concept
		 * 1. we should not touch the source code.
		 * 2. This application should be configurable.
		
		//Hard-coding
		//for airtel class method
		Airtel a = new Airtel();
		a.calling();
		a.data();
		
		//for jio class method
		Jio j = new Jio();
		j.calling();
		j.data();
		*/
		
		ApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config loaded.......");
		
//		Airtel a1 = (Airtel)a.getBean("Airtel");
//		a1.calling();
//		a1.data();
		
//		Jio j = (Jio)a.getBean("Jio");
//		j.calling();
//		j.data();
		
		Sim s = a.getBean("Sim", Sim.class);
		s.calling();
		s.data();
	}

}
