package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;

//jparepository is exists in spring data Jps dependencies while creating the project we have added it.
public interface Adminrepository extends JpaRepository<Admin,Integer>{

}