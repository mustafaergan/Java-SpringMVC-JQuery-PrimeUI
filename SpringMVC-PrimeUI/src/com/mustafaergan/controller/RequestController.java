package com.mustafaergan.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/hi")
@Scope("session")
public class RequestController {

	@RequestMapping(value="/jquery", method = RequestMethod.GET)
	public String jqueryWelcome(ModelMap model) {
		model.addAttribute("text", "Hi! I am Here");
		return "jquery";
	}
	
	@RequestMapping(value="primeui", method = RequestMethod.GET)
	public String primeuiWelcome(ModelMap model) {
		model.addAttribute("text", "Hi! I am Here");
		return "primeui";
	}

}
