package com.day6.singleinheritace;

public class Citizen {
	
	private String name;
	private long aadharNo;
	private String address;
	private long mobileNo;
	
	public Citizen(){
		System.out.println("No argument Constructor");
	}
	

	public Citizen(String name, long aadharNo, String address, long mobileNo) {
		super();
		this.name = name;
		this.aadharNo = aadharNo;
		this.address = address;
		this.mobileNo = mobileNo;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	

	public long getAadharNo() {
		return aadharNo;
	}


	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public long getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	


	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + ", mobileNo=" + mobileNo
				+ "]";
	}


}
