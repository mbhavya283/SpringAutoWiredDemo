package com.spring.demo;

public class Customer {

	private int custID; 
	private String customerName; 
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	/*public Customer(int custID, String customerName) {
		super();
		this.custID = custID;
		this.customerName = customerName;
	}*/

	public Customer() {
	}
}
