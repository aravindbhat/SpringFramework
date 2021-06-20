package com.sorcerer.annotationdependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie implements OnlineBooking {
	@Autowired
	Ticket t;
	
	public void display() {
		System.out.println("Using Autowired annotation for Ticket");
		System.out.println("Movie Ticket booking in progress");
		t.ticketType();

	}

}
