package com.example.demo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PlacementService 
{
	@Autowired
	private PlacementRepository prepo;
	// create or insert or update
		public void create(Placement p)
		{
			prepo.save(p);
		}
		
		//retrieve a data with specific id
		public Placement retrieve(Integer id)
		{
			return prepo.findById(id).get();
		}
		
		//retrieve all data
		public List<Placement> retrieveAll()
		{
			return prepo.findAll();
		}
		
		//delete
		public void delete(Integer id)
		{
			prepo.deleteById(id);
		}
}