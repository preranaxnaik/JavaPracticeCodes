package com.day8.abstractkeyword;

public class Rectangle extends Shape{
	private float length;
	private float breadth;
	
	
	public Rectangle() {
		this.length = 5.0f;
		this.breadth = 2.0f;	
	}
	
	
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	@Override 
	void calcArea() {
		area = length * breadth;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
