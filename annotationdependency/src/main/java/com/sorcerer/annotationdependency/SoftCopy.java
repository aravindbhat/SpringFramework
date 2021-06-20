package com.sorcerer.annotationdependency;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary 
public class SoftCopy implements Ticket {

	public void ticketType() {
		System.out.println("Using @primary for softcopy");
		System.out.println("Ticket Soft Copy sent to your Mail!!!!");

	}

}
