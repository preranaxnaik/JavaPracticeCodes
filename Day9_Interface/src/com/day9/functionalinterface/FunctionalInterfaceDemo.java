package com.day9.functionalinterface;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		GreetClass g = new GreetClass();
		System.out.println(g.greet());
		
		//using Lambda expression
		//here g1 is reference object  since it is not initialized memory using new and constructor
		GreetInterface g1 = () -> {
			return "Good Morning";
		};
		
		System.out.println(g1.greet());
	}

}
