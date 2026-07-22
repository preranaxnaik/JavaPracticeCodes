package com.dayfive.encapsulation;

public class OopsConceptDemo {
	
	private int serialNo ;
	private String name;
	private int age;
	
	//getter methods
	
	public int getSerialNo() {
		return serialNo;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	//setter methods
	
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo ;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	@Override
	public String toString() {
		return "OopsConceptDemo [serialNo=" + serialNo + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
