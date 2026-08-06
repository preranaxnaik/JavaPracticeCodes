//Array of Parent References pointing to Child objects(Polymorphism)
package com.day10.runtimepolymorphism;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		
		shapes[0] = new Circle(5.0);
		shapes[1] = new Square(6.0);
		shapes[2] = new Triangle(3.0,7.0);
		
		for(Shape s : shapes) {
			s.draw();
			s.erase();
			System.out.println();
		}
	}

}
