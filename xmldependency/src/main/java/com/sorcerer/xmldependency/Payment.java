package com.sorcerer.xmldependency;

public class Payment {
	
	private String typeofPayment;
	private String defaultPayment;

	public String getDefaultPayment() {
		return defaultPayment;
	}


	public void setDefaultPayment(String defaultPayment) {
		this.defaultPayment = defaultPayment;
	}


	public Payment(String typeofPayment) {
		super();
		this.typeofPayment = typeofPayment;
	}
	
	
	public String getTypeofPayment() {
		return typeofPayment;
	}

	public void setTypeofPayment(String typeofPayment) {
		this.typeofPayment = typeofPayment;
	}


	@Override
	public String toString() {
		return "Using xml constructor-arg tag for assigning value to typeofPayment\nUsing property tag to assign value to defaultPayment\n ";
	}

	


	
	
}
