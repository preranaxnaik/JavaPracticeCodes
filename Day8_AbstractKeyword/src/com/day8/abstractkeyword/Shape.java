package com.day8.abstractkeyword;

abstract class Shape {

    // Abstract method (no body)
    abstract void calcArea();

    // Concrete method
    void show() {
        System.out.println("This is a concrete method in the abstract class.That is method described without abstract keyword");
    }
}
