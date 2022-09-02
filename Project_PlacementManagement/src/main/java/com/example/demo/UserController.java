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
public class UserController
{
	@Autowired
	private UserService uservice;
	
	//RESTFUL API method to create operation
		@PostMapping("/user")		//for creation
		public void add(@RequestBody User u)
		{
			uservice.create(u);
		}
		
		//RESTFUL API method to delete operation
		@DeleteMapping("/user/{id}")
		public void remove(@PathVariable Integer id)
		{
			uservice.delete(id);
		}
		
		//RESTFUL API method to update operation
		@PutMapping("/user/{id}")
		public ResponseEntity<?> update(@RequestBody User u,@PathVariable Integer id)
		{
			try
			{
				User existObject=uservice.retrieve(id);
				uservice.create(u);
				return new ResponseEntity<>(HttpStatus.OK);
			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			
		}
		
		//RESTFUL API method to retrieve operation
		@GetMapping("/user/{id}")
		public ResponseEntity<User>get(@PathVariable Integer id)
		{
			try
			{
				User u=uservice.retrieve(id);
				return new ResponseEntity<User>(u, HttpStatus.OK);
			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
			}
		}
		
		//RESTFUL API method to retrieveAll operation
		@GetMapping("/user")
		public List<User>listAll()
		{
			return uservice.retrieveAll();
			
		}
}
