package com.day8.abstractkeyword;

//abstract class
public abstract class Shape {
	protected float area;

    // Abstract method (no body)
    abstract void calcArea();

    // Concrete method
    void show() {
        System.out.println("The area of the shape is : "+ area);
    }
}
