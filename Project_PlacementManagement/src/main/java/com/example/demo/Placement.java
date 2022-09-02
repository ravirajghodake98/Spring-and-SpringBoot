package com.example.demo;
import javax.persistence.*;

@Entity
public class Placement 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String college;
	private String qualification;
	private Integer year;
	
	//default constructor
	public Placement() 
	{
		
	}
	//parameterized constructor
	public Placement(Integer id, String name, String college, String qualification, Integer year) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.qualification = qualification;
		this.year = year;
	}
	
	//getter and setter
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
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	//to string method
	@Override
	public String toString() {
		return String.format("Placement [id=%s, name=%s, college=%s, qualification=%s, year=%s]", id, name,
				college, qualification, year);
	}
}