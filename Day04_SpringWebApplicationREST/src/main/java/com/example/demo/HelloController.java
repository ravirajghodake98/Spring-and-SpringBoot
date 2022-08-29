package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
//using below annotation, request will pass to the server and will get the response
@RestController
public class HelloController 
{
	@RequestMapping("/M21")
	public String display()
	{
		return "Swaagat nahi karoge hamaara";
	}
}
