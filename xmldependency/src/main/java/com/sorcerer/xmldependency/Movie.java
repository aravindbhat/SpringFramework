package com.sorcerer.xmldependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Movie implements OnlineBooking {
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
		System.out.println("Movie Ticket booking in progress....."+t);

	}

}
