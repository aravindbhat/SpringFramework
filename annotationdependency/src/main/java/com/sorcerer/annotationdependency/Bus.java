package com.sorcerer.annotationdependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bus implements OnlineBooking {
	@Autowired
	@Qualifier("HARDCOPY")
	Ticket t;
	public void display() {
		
		System.out.println("Bus Ticket booking in progress.....");
		System.out.println("Using @Qualifier annotation to get ticket type");
		t.ticketType();
	}

}
