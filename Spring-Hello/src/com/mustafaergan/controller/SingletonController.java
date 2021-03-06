package com.mustafaergan.controller;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mustafaergan.service.HelloService;
import com.mustafaergan.service.ScopeService;

@Controller
@RequestMapping("/si")
public class SingletonController {

	@Autowired
	HelloService helloService;
	
	@Autowired
	ScopeService scopeService;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("text", "Hi! I am Here");
		return "hello";
	}
	
	@RequestMapping(value = "/service1/{param1}", method = RequestMethod.GET)
	public String printWelcomeService1(ModelMap model, @PathVariable("param1") String param1) {
		helloService.setMessage(param1+ " prototype");
		scopeService.setMessage(param1+ " singleton");
		model.addAttribute("text1", helloService.getMessage());
		model.addAttribute("text2", scopeService.getMessage());
		return "hello2";
	}
	
	@RequestMapping(value = "/service2", method = RequestMethod.GET)
	public String printWelcomeService2(ModelMap model) {
		model.addAttribute("text", helloService.getMessage());
		return "hello";
	}
	
	@RequestMapping(value = "/service3", method = RequestMethod.GET)
	public String printWelcomeService3(ModelMap model) {
		model.addAttribute("text", scopeService.getMessage());
		return "hello";
	}

}
