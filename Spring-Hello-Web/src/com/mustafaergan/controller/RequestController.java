package com.mustafaergan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mustafaergan.service.HelloService;
import com.mustafaergan.service.HelloService2;

@Controller
@RequestMapping("/hi")
@Scope("session")
public class RequestController {

	@Autowired
	HelloService helloService;
	
	@Autowired
	HelloService2 helloService2;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("text", "Hi! I am Here");
		return "hello";
	}
	
	@RequestMapping(value = "/service1/{param1}", method = RequestMethod.GET)
	public String printWelcomeService1(ModelMap model, @PathVariable("param1") String param1) {
		helloService.setMessage(param1+ " prototype");
		helloService2.setMessage(param1+ " singleton");
		model.addAttribute("text1", helloService.getMessage());
		model.addAttribute("text2", helloService2.getMessage());
		return "hello2";
	}
	
	@RequestMapping(value = "/service2", method = RequestMethod.GET)
	public String printWelcomeService2(ModelMap model) {
		model.addAttribute("text", helloService.getMessage());
		return "hello";
	}
	
	@RequestMapping(value = "/service3", method = RequestMethod.GET)
	public String printWelcomeService3(ModelMap model) {
		model.addAttribute("text", helloService2.getMessage());
		return "hello";
	}

}
