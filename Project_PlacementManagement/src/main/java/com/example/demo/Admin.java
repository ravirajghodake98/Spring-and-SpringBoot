package com.example.demo;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
private String name;
private String password;


// constructor
public Admin() 
{

}

public Admin(Integer id, String name, String password) {
super();
this.id = id;
this.name = name;
this.password=password;
}
//  getter setter

public Integer getId() {
return id;
}
public void setId(Integer id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}
// tostring

@Override
public String toString() {
return "Admin [id=" + id + ", name=" + name + ", password=" + password + "]";
}
}