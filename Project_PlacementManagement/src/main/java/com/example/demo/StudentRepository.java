package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//JpaRepository exists in Spring Data JPA dependencies,
//while creating the project we have added it
public interface StudentRepository extends JpaRepository<Student,Integer>
{
	
}
