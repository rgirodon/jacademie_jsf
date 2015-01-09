package org.jacademie.controller;

import javax.faces.bean.ManagedBean;

import org.apache.log4j.Logger;

@ManagedBean
public class FormHelloWorld {

	Logger logger = Logger.getLogger(FormHelloWorld.class);
	
	private String firstName;
	
	private String lastName;
	
	private Integer age;

	public FormHelloWorld() {
		super();
	}

	public String sayHello() {
		
		logger.debug("in sayHello");
		
		return "bienvenue";
	}
	
	public String getMessage() {
		return "Hello " + this.getFirstName() + " " + this.getLastName() + " [" + this.getAge() + "] ! ";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}	
}
