package com.day10.compiletimepolymorphism;

public class Executor {

	public static void main(String[] args) {
		System.out.println("Is 121 Palindrome : "+ Operations.isPalindrome(121));
		System.out.println("Is 312 Palindrome : "+ Operations.isPalindrome(312));
		System.out.println("Is NAYAN Palindrome : "+ Operations.isPalindrome("NAYAN"));
		System.out.println("Is PRIYA Palindrome : "+ Operations.isPalindrome("PRIYA"));

	}

}
