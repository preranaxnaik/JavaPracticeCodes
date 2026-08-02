package com.day7.staticmethodblock;

public class MyClass {
	
	private static int srNo;
	
	static void display() {
		System.out.println("Serial No : "+ srNo);
	}
	
	void data() {
		System.out.println("Serial No : "+ srNo);
	}
	
	//static block
	static{
		srNo = 4115;
		System.out.println("Static Block Executed");
	}

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		MyClass.display();
		obj.data();

	}

}
