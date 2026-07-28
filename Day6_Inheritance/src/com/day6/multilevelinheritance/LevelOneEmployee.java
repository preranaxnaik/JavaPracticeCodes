//program to define intermediate class inheriting from employees
package com.day6.multilevelinheritance;

public class LevelOneEmployee extends Employee{
	
	private String authority;
	private int noOfShares;
	
	
	

	public LevelOneEmployee(String name, long contactNo, String deptName, double baseSalary, String authority , int noOfShares) {
		super(name, contactNo, deptName, baseSalary);
		this.authority = authority;
		this.noOfShares = noOfShares;
	}

	@Override
	public String toString() {
		return "LevelOneEmployee [authority=" + authority + ", noOfShares=" + noOfShares + ", getDeptName()="
				+ getDeptName() + ", getBaseSalary()=" + getBaseSalary() + ", getName()=" + getName()
				+ ", getContactNo()=" + getContactNo() + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
