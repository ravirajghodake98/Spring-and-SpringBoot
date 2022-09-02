package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Component		//beans creation
@Controller		//request and response from web
//@RestController
public class HomeController
{
	@RequestMapping("home")
	public String home()
	{
		System.out.println("Welcome to Jurassic Park");
		return "Home.jsp";
	}
}
