package com.day9.interfaces;

public class DriverClass implements InterfaceDemo{
	
	@Override
	public void show() {
		System.out.println("abstract method");
		
	}

	public static void main(String[] args) {
		 DriverClass obj = new DriverClass();
		 // Calling abstract method
		 obj.show();

	     // Calling default method
	     obj.print();

	     // Calling static method
	     InterfaceDemo.display();

	     // Accessing interface variable
	     System.out.println("x = " + InterfaceDemo.x);

	}

}
