package com.sorcerer.xmldependency;

public class Train implements OnlineBooking {
	private Ticket t;
	
	public Ticket getT() {
		return t;
	}

	public void setT(Ticket t) {
		this.t = t;
	}

	public void display() {
		System.out.println("Train Ticket booking in progress....."+t);

	}

}
