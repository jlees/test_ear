package com.lees.test.ejb;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloBean
 */
@Stateless
public class HelloBean implements HelloBeanLocal {

	public String sayHello(String input) {
		return "Hello " + ((input == null) ? "Default" : input);
	}

}
