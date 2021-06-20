package com.sorcerer.xmldependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ticket {
	@Autowired
	private Payment payment;

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		
		return "\n"+payment+"Payment in progress !!! Please pay using below methods\nType 1: " + payment.getTypeofPayment() + "\nType 2: "+payment.getDefaultPayment();
	}
	
}
