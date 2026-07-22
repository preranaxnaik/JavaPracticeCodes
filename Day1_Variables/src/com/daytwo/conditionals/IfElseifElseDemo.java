package com.daytwo.conditionals;

public class IfElseifElseDemo {
	public static void main(String[] args) {
		String token = "white";
		if(token == "white") {
			System.out.println("Tea or Coffee");
		}
		else if(token == "yellow"){
			System.out.println("Poha or Upma");
		}
		else if(token == "red"){
			System.out.println("Chinese");
		}
		else {
			System.out.println("No token !");
		}
	}
}
