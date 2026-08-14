package com.day13.exceptionhandling;

public class TryCatchExample {

	public static void main(String[] args) {
		
		System.out.println("The program shows Exception");
		try {
			int data = 100 / 0;
			System.out.println(data);
		}
		catch(ArithmeticException a) {
			//a.printStackTrace();
			System.err.println("Number divided by zero");
			//System.out.println("Number divided by zero");
		}
		System.out.println("Exception Handled");

	}

}
