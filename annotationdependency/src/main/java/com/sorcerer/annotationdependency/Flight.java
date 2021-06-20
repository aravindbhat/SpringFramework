package com.sorcerer.annotationdependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Flight implements OnlineBooking {
	@Autowired
	HardCopy h;
	public void display() {
		System.out.println("Using Autowired annotation for Ticket Hardcopy");
		System.out.println("Flight Ticket booking in progress.....");
		h.ticketType();

	}

}
