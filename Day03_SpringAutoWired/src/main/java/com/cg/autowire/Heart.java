package com.cg.autowire;

public class Heart
{
	private String nameOfAnimal;
	private String noOfHeart;
	
	public String getNameOfAnimal() {
		return nameOfAnimal;
	}

	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}

	public String getNoOfHeart() {
		return noOfHeart;
	}

	public void setNoOfHeart(String noOfHeart) {
		this.noOfHeart = noOfHeart;
	}

	public void pump()
	{
		System.out.println("The program is executing");
		System.out.println("My heart is beating..dhak dhak..dhak dhak..dhak dhak..");
	}
}
