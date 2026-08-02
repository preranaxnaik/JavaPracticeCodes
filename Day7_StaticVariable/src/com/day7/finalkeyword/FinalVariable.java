package com.day7.finalkeyword;

public class FinalVariable {

    // Final static variable (constant)
    final static int x = 9;

    // Final instance variable
    final int y = 100;

    // Final method
    final void finalMethod() {
        System.out.println("Final method from Parent Class");
    }

    // Normal method
    void display() {
        System.out.println("Normal method from Parent Class");
    }
}