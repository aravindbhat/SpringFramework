package com.sorcerer.annotationdependency;

import org.springframework.stereotype.Component;


public class Train implements OnlineBooking {
	

	public void display() {
		System.out.println("Train Ticket booking in progress.....");

	}

}
