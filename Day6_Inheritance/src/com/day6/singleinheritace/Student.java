package com.day6.singleinheritace;

public class Student extends Citizen{
	private int rollNo;
	private String collegeName;
	
	public Student() {
		super();
	}
	
	
	public Student(String name, long aadharNo, String address, long mobileNo, int rollNo , String  collegeName) {
		super(name, aadharNo, address, mobileNo);
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}
	

	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getCollegeName() {
		return collegeName;
	}


	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	
	
	@Override
	public String toString() {
	    return "Student [Roll No = " + rollNo +
	           ", College Name =" + collegeName +
	           ", Name = " + getName() +
	           ", Aadhar No = " + getAadharNo() +
	           ", Address = " + getAddress() +
	           ", Mobile No = " + getMobileNo() +
	           "]";
	}

}
