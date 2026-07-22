package com.daythree.userdefinedinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Integer input
        System.out.print("Enter the age: ");
        int age = Integer.parseInt(br.readLine());

        // String input
        System.out.print("Enter the name: ");
        String name = br.readLine();

        // Character input
        System.out.print("Enter your gender (M/F): ");
        char gender = br.readLine().charAt(0);

        // Float input
        System.out.print("Enter your salary: ");
        float salary = Float.parseFloat(br.readLine());

        // Double input
        System.out.print("Enter your percentage: ");
        double percentage = Double.parseDouble(br.readLine());

        // Long input
        System.out.print("Enter your mobile number: ");
        long mobile = Long.parseLong(br.readLine());

        // Boolean input
        System.out.print("Are you employed? (true/false): ");
        boolean employed = Boolean.parseBoolean(br.readLine());

        // Display the entered data
        System.out.println("\n----- User Details -----");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Gender     : " + gender);
        System.out.println("Salary     : " + salary);
        System.out.println("Percentage : " + percentage);
        System.out.println("Mobile     : " + mobile);
        System.out.println("Employed   : " + employed);

        br.close();
    }
}