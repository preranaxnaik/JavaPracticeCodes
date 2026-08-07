//program to demonstrate ways to declare a string
package com.day11.strings;

public class SampleString {

	public static void main(String[] args) {
		
		//character array
		char c[] = {'I','N','D','I','A'};
		String s1 = new String(c);
		System.out.println(s1);
		
		//object type
		String s2 = new String("Java Programming");
		System.out.println(s2);
		
		//primitive type or string literal
		String s3 ="Artificial Intelligence";
		System.out.println(s3);
		
		//reference type
		String s4 = new String(s2);
		System.out.println(s4);
		
		
	}

}
