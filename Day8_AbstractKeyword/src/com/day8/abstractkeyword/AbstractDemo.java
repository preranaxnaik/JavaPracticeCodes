package com.day8.abstractkeyword;

public class AbstractDemo {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Square sq = new Square();
		
		r.calcArea();
		r.show();
		sq.calcArea();
		sq.show();

	}

}
