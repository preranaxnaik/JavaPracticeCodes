package com.daythree.userdefinedinput;
import java.util.*;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		//String Input
		System.out.print("Enter the name : ");
		String name = sc.nextLine();
		
        // Character input
        System.out.print("Enter your gender (M/F): ");
        char gender = sc.next().charAt(0);

        // Float input
        System.out.print("Enter your salary: ");
        float salary = sc.nextFloat();

        // Double input
        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble();

        // Long input
        System.out.print("Enter your mobile number: ");
        long mobile = sc.nextLong();

        // Boolean input
        System.out.print("Are you employed? (true/false): ");
        boolean employed = sc.nextBoolean();

        // Display the entered data
        System.out.println("\n----- User Details -----");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Gender     : " + gender);
        System.out.println("Salary     : " + salary);
        System.out.println("Percentage : " + percentage);
        System.out.println("Mobile     : " + mobile);
        System.out.println("Employed   : " + employed);

		
		sc.close();
	}

}
