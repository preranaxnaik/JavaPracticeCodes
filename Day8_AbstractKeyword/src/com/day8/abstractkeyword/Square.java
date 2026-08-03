package com.day8.abstractkeyword;

public class Square extends Shape{
	private float side;
	
	public Square() {
		this.side = 9.0f;
	} 
	

	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	void calcArea() {
		area = side * side;
	}

}
