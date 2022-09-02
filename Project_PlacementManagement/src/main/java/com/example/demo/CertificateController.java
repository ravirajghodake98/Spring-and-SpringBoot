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
public class CertificateController 
{
	@Autowired
	private CertificateService ctservice;
	
	//RESTFUL API method to create operation
		@PostMapping("/certificate")		//for creation
		public void add(@RequestBody Certificate ct)
		{
			ctservice.create(ct);
		}
		
		//RESTFUL API method to delete operation
		@DeleteMapping("/certificate/{id}")
		public void remove(@PathVariable Integer id)
		{
			ctservice.delete(id);
		}
		
		//RESTFUL API method to update operation
		@PutMapping("/certificate/{id}")
		public ResponseEntity<?> update(@RequestBody Certificate ct,@PathVariable Integer id)
		{
			try
			{
				Certificate existObject=ctservice.retrieve(id);
				ctservice.create(ct);
				return new ResponseEntity<>(HttpStatus.OK);
			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			
		}
		
		//RESTFUL API method to retrieve operation
		@GetMapping("/certificate/{id}")
		public ResponseEntity<Certificate>get(@PathVariable Integer id)
		{
			try
			{
				Certificate ct=ctservice.retrieve(id);
				return new ResponseEntity<Certificate>(ct, HttpStatus.OK);
			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
			}
		}
		
		//RESTFUL API method to retrieveAll operation
		@GetMapping("/certificate")
		public List<Certificate>listAll()
		{
			return ctservice.retrieveAll();
			
		}
}
