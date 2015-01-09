package org.jacademie.controller;

import javax.faces.bean.ManagedBean;

import org.apache.log4j.Logger;

@ManagedBean
public class FormHelloWorld {

	Logger logger = Logger.getLogger(FormHelloWorld.class);
	
	private String firstName;
	
	private String surName;

	public FormHelloWorld() {
		super();
	}

	public String sayHello() {
		
		logger.debug("in sayHello");
		
		return "bienvenue";
	}
	
	public String getMessage() {
		return "Hello " + this.getFirstName() + " " + this.getSurName() + " ! ";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}
}
