package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
	@Autowired
	private StudentService service;
	
	//RESTFUL API method to create operation
	@PostMapping("/students")		//for creation
	public void add(@RequestBody Student s)
	{
		service.create(s);
	}
	
	//RESTFUL API method to delete operation
	@DeleteMapping("/students/{id}")
	public void remove(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
	//RESTFUL API method to update operation
	@PutMapping("/students/{id}")
	public ResponseEntity<?> update(@RequestBody Student s,@PathVariable Integer id)
	{
		try
		{
			@SuppressWarnings("unused")
			Student existObject=service.retrieve(id);
			service.create(s);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	//RESTFUL API method to retrieve operation
	@GetMapping("/students/{id}")
	public ResponseEntity<Student>get(@PathVariable Integer id)
	{
		try
		{
			Student s=service.retrieve(id);
			return new ResponseEntity<Student>(s, HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
	
	//RESTFUL API method to retrieveAll operation
	@GetMapping("/students")
	public List<Student>listAll()
	{
		return service.retrieveAll();
		
	}
}
