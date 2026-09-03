package com.day15.wrapperclasses;

public class WrapperClassDemo {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		//autoboxing 
		int a = 100;
		Integer i = a;
		System.out.println(i);
		
		//Unboxing
		Integer x = new Integer(20);
		int b = x.intValue();

	}

}
