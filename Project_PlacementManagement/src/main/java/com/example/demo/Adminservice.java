package com.example.demo;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class Adminservice {
@Autowired
// to inject object dependency
private Adminrepository arepo;
// create
public void create(Admin a)
{
arepo.save(a);
}
public Admin retrieve(Integer id)
{
return arepo.findById(id).get();
}
// retrieve
public List<Admin>retrieveAll()
{
return arepo.findAll();
}
//  delete
public void delete(Integer id)
{
arepo.deleteById(id);
}

}
