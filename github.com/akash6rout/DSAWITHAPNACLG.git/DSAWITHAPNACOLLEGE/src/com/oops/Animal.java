package com.oops;

public class Animal extends Human{
	
	public static void whatIsAnimal() {
		System.out.println("Animal having a pure heart");
	}
	public static void main(String[] args) {
		
		Animal animal=new Animal();
		animal.whatIsAnimal();
		animal.whatIsHuman();
	}

}
