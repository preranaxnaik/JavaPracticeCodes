package com.dayone.variables;

public class VariablesDemo {
	
	static void register() {
		byte age = 21;
		short rollNumber = 4130;
		int pinCode = 411028;
		long mobileNumber = 7864582564L;
		float percentage = 92.83f;
		double fees = 112320.536d;
		char gender = 'F';
		boolean isHosteller = true;
		System.out.println("Age : " + age);
		System.out.println("Roll Number : "+ rollNumber);
		System.out.println("Pin Code : "+ pinCode);
		System.out.println("Mobile Number : "+ mobileNumber);
		System.out.println("Percentage : "+ percentage);
		System.out.println("Fees : "+ fees);
		System.out.println("Gender : "+ gender);
		System.out.println("Is Hosteller : "+ isHosteller);
//		System.out.println("Age : " + age + 
//				"\nRoll Number : " + rollNumber + 
//				"\nPin Code : " + pinCode +
//				"\nMobile Number : " + mobileNumber + 
//				"\nPercentage : " + percentage + 
//				"\nFees : " + fees + 
//				"\nGender : " + gender + 
//				"\nIs Hosteller : " + isHosteller);
	}
	
	
	public static void main(String[] args) {
		System.out.println("Day 1 : Learning Variables");
		VariablesDemo obj = new VariablesDemo();
		obj.register();
	}
}
