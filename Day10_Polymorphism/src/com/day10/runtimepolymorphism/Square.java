package com.day10.runtimepolymorphism;

public class Square extends Shape{
	private double side;

	public Square(double side) {
		super();
		this.side = side;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing a square with side "+ side);
	}
	
	@Override
	public void erase() {
		System.out.println("Erasing a square with side "+ side);
	}
	
}
