package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CertificateService 
{
	@Autowired		//to inject object dependencies
	private CertificateRepository ctrepo;
	
	//create(insert) or update
		public void create(Certificate ct)
		{
			ctrepo.save(ct);
		}
		
		//retrieve data
		public Certificate retrieve(Integer id)
		{
			return ctrepo.findById(id).get();
		}
		
		//retrieve all the data
		public List<Certificate>retrieveAll()
		{
			return ctrepo.findAll();
			
		}
		
		//delete
		public void delete(Integer id)
		{
			ctrepo.deleteById(id);
		}
}
