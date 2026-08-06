//program to demonstrate method overloading
package com.day10.compiletimepolymorphism;

public class Student {
	
	public void studentDetails() {
		System.out.println("Please enter your details");
	}
	
	//number of parameters
	public void studentDetails(int id, String name) {
		System.out.println("Please enter your details");
	}
	
	//position of parameters
	public void studentDetails(String name, int id) {
		System.out.println("Please enter your details");
	}
	
	//datatypes of parameters
	public void studentDetails(String name, short id) {
		System.out.println("Please enter your details");
	}

}
