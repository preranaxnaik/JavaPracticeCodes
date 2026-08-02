package com.day7.finalkeyword;

public class FinalVariableDemo extends FinalVariable {

    // Overriding normal method (Allowed)
    @Override
    void display() {
        System.out.println("Normal method overridden in Child Class");
    }

    public static void main(String[] args) {

        FinalVariableDemo obj = new FinalVariableDemo();

        // Accessing final static variable
        System.out.println("Value of x = " + x);

        // Accessing final instance variable
        System.out.println("Value of y = " + obj.COMPANY);

        // Calling final method
        obj.finalMethod();

        // Calling overridden method
        obj.display();
    }
}