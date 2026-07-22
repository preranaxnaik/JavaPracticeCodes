package com.daythree.userdefinedinput;
import java.util.*;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter the name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter the designation : ");
		String desg = sc.next();
		
		System.out.print("Enter the salary : ");
		float salary = sc.nextFloat();
		
		System.out.print("Enter the mobile number : ");
		long mobile = sc.nextLong();
		
		
		System.out.println("\nEmployee Details");
        System.out.println("----------------");
        System.out.println("Age         : " + age);
        System.out.println("Name        : " + name);
        System.out.println("Designation : " + desg);
        System.out.println("Salary      : " + salary);
        System.out.println("Mobile      : " + mobile);
		
		
		sc.close();
	}

}
