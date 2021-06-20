package com.sorcerer.xmldependency;

import org.springframework.beans.factory.annotation.Autowired;

public class Flight implements OnlineBooking {
	@Autowired
	private Ticket t;
	
	public Ticket getT() {
		return t;
	}

	public void setT(Ticket t) {
		this.t = t;
	}

	public void display() {
		System.out.println("Using Autowired annotation for Ticket");
		System.out.println("Flight Ticket booking in progress....."+t);

	}

}
