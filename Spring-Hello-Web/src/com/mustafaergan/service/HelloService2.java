package com.mustafaergan.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService2 {
	
	String message = "Selam Dostlar Request ";
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
}
