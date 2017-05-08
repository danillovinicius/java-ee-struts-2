package com.pluralsight.actions;

import com.opensymphony.xwork2.Action;


public class HelloAction implements Action {

	private String greeting;

	@Override
	public String execute() throws Exception {
		setGreeting("Hello Struts 2");

		return SUCCESS;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

}
