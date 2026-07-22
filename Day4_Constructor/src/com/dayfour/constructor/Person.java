package com.dayfour.constructor;

public class Person {
	
	//default constructor non parameterized 
	public Person() {
		System.out.println("Default constructor created");
	}
	
	//parameterized constructor
	public Person(String name , int age) {
		System.out.println("Parameterized constructor created");
		System.out.println("Name : "+name+"	Age : "+age);
	}
	
	// constructor overloading (feature of polymorphism)
	public Person(int age , String name) {
		System.out.println("Parameterized constructor overloaded");
		System.out.println("Age : "+age);
		System.out.println("Name : "+name);		
	}
	
	
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("Prerana", 21);
		Person p3 = new Person(22, "Krushna");
	}

}
