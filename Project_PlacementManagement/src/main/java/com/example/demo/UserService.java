package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService 
{
	@Autowired		//to inject object dependencies
	private UserRepository urepo;
	
	//create(insert) or update
		public void create(User u)
		{
			urepo.save(u);
		}
		
		//retrieve data
		public User retrieve(Integer id)
		{
			return urepo.findById(id).get();
		}
		
		//retrieve all the data
		public List<User>retrieveAll()
		{
			return urepo.findAll();
			
		}
		
		//delete
		public void delete(Integer id)
		{
			urepo.deleteById(id);
		}
}
