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
public class Admincontroller
{
@Autowired
private Adminservice service;
@PostMapping("admin")
//    restfull APL method
public void add(@RequestBody Admin a)
{
service.create(a);
}
@DeleteMapping("/admin/{id}")
public void remove(@PathVariable Integer id)
{
service.delete(id);

}
// update
@PutMapping("admin/{id}")
public ResponseEntity<?>update(@RequestBody Admin a,@PathVariable Integer id)
{
try {


@SuppressWarnings("unused")
Admin existObject=service.retrieve(id);
service.create(a);
return new ResponseEntity<>(HttpStatus.OK);
}
catch(NoSuchElementException e)
{
return new ResponseEntity<>(HttpStatus.NOT_FOUND);
}
}

//RESTFUL API method to retrieve operation
@GetMapping("/admin/{id}")
public ResponseEntity<Admin>get(@PathVariable Integer id)
{
try
{
Admin s=service.retrieve(id);
return new ResponseEntity<Admin>(s, HttpStatus.OK);
}
catch(NoSuchElementException e)
{
return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
}
}

//RESTFUL API method to retrieveAll operation
@GetMapping("/admin")
public List<Admin>listAll()
{
return service.retrieveAll();

}
}