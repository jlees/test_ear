package com.lees.test.web;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.EJB;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lees.test.ejb.HelloBeanLocal;


@Controller
public class HelloController {
	
	@EJB
	private HelloBeanLocal helloBean;
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public ModelAndView sayHello(@RequestParam(defaultValue="John") String name) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("greeting", helloBean.sayHello(name));
		return new ModelAndView("hello", model);
	}

}
