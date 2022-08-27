package com.cg.springioc;

public class Airtel implements Sim
{
	
	public Airtel() {
		super();
		System.out.println("Constructor-airtel");
	}

	public void calling() {
		System.out.println("Calling using Airtel sim");
		
	}

	public void data() {
		System.out.println("Browsing using Airtel sim");
		
	}

}
