package com.daytwo.conditionals;

public class NestedIfDemo {

	public static void main(String[] args) {
		String userName = "Prerana";
		String password = "prerana@123";
		if (userName == "Prerana" ) 
		{
			if (password == "prerana@123")
			{
				System.out.println("Login Successfully !");
			}else 
			{
				System.out.println("Invalid password");
			}
				
		}else
		{
			System.out.println("Invalid username");
		}
	}

}

