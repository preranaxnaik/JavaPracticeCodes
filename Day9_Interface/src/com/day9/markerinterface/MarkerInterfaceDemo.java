package com.day9.markerinterface;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		Student s = new Student(101, "Krushna", 12320d, "C++");
		System.out.println(s);
		Student1 s1 = new Student1(102, "Prerana", 12320d, "Java");
		System.out.println(s1);
		if (s instanceof Registrable)
			System.out.println("Student is registered for the course");
		else 
			System.out.println("Student is not registered for the course");
	}

}

