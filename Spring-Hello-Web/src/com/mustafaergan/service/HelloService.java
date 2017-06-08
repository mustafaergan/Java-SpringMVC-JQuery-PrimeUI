package com.mustafaergan.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	String message = "Selam Dostlar session";
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
}
