package com.sorcerer.annotationdependency;

import org.springframework.stereotype.Component;

@Component("HARDCOPY")
public class HardCopy implements Ticket {

	public void ticketType() {
		System.out.println("@Component used with value!!");
		System.out.println("Ticket Hard Copy sent to your address!!!!");

	}

}
