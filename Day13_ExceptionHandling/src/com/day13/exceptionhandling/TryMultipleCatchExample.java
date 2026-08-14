package com.day13.exceptionhandling;
import java.util.*;

public class TryMultipleCatchExample {

	public static void main(String[] args) {
		System.out.println("This is Main Method");
		int num1, num2 , num3;
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			try {
				System.out.print("Enter the first number : ");
				num1 = sc.nextInt();
				System.out.print("Enter the second number : ");
				num2 = sc.nextInt();
				num3 = num1 / num2;
				System.out.println("Division is : "+num3);
			}
			catch(ArithmeticException a) {
				a.printStackTrace();
				System.out.println("Exception Caught "+ a.getMessage());
			}
			catch(InputMismatchException i) {
				System.out.println("Invalid input. Please enter integers only!");
				sc.nextLine();
			}
			catch(Exception e) {
				System.out.println("Exception caught "+ e.getMessage());
			}
		}
				
	}

}
