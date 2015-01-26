package com.lees.test.ejb;

import javax.ejb.Local;

@Local
public interface HelloBeanLocal {

	public String sayHello(String input);
	
}
