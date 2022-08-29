package com.cg.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Dependency injection in term of literals
public class Exam {

	public static void main(String[] args) {
//		Student s = new Student();
//		s.StudentName = "Raviraj";
//		s.setStudentName("Raviraj");
		
		ApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("The file is executing");
//		Student s = a.getBean("s1", Student.class);
		Student s1 = a.getBean("s2", Student.class);
//		s.display();
		s1.display();
	}

}
