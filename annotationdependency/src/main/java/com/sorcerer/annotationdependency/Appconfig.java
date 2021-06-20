package com.sorcerer.annotationdependency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages =  "com.sorcerer.annotationdependency")
public class Appconfig {
	@Bean
	public Train getPurpose() {
		return new Train();
	}
	@Bean
	public Flight getPurpose1() {
		return new Flight();
	}
}
