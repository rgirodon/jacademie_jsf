package org.jacademie.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloWorld {
	
	private String message;

	public HelloWorld() {
		
		super();
		
		this.message = "Hello J//Academie !";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}	
}
