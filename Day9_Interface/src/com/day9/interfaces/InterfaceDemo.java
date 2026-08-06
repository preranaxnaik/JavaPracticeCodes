package com.day9.interfaces;

public interface InterfaceDemo {
	//public static final variable
	int x = 10;
	
	//public abstract method 
	void show();
	
	//default method
	default void print() {
		System.out.println("default method");
	}
	
	//static method
	static void display() {
		System.out.println("static method");
	}

}
