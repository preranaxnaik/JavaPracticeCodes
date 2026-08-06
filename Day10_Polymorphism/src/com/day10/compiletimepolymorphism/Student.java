//program to demonstrate method overloading
package com.day10.compiletimepolymorphism;

public class Student {
	
	public void studentDetails() {
		System.out.println("Please enter your details ");
	}
	
	public void studentDetails(int id, String name) {
		System.out.println("Please enter your details ");
	}
	
	public void studentDetails(String name, int id) {
		System.out.println("Please enter your details ");
	}
	
	public void studentDetails(String name, short id) {
		System.out.println("Please enter your details ");
	}

}
