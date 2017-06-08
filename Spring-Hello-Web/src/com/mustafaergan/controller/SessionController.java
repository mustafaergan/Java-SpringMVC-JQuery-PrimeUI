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


/**
 * 
 * @singleton Tüm bean ler standart olarak singleton scope kullanırlar
 * Bean nesnesi sadece bir kere oluşturulur ve her sorgulamada bu nesne kullanılır
 * 
 * @Prototype Singleton scope tam tersi Bean nesnesi her 
 * sorgulamada oluşturulur ve ayni nesne kullanilmaz
 * 
 * 
 * @Web scopes (Request, Session, Global Session) Yalnızca web aksi halde IllegalStateException hatası alınır.
 * 
 * <web-app>
 *	<listener>
 *		<listener-class>
 * 			org.springframework.web.context.request.RequestContextListener
 *		</listener-class>
 *	</listener>
 * </web-app>
 * 
 * @Request Her HTTP isteği için yeni bir bean yaratılır. HTTP isteği sona erince bean yok edilir
 * @Session HTTP session başlamasıyla oluşturulur ve session süresince değişmez.
 * @Global Session Sadece Portlet uygulamaları için kullanılır Web uygulamaları için kullanıldığı taktirde session scope görevi görür 
 * 
 * Not:
 * Portlet'ler içerik yönetim sisteminin en temel ve en küçük objelerinden biridir. Temel olarak portlet objesi bir html kodundan oluşur ve seçildiği zone'un içerisindeki article sayısına göre kendini tekrarlar. 
 * Portlet'ler tiplerine göre bir çok amaçla kullanılmaktadır.
 * 
 */
@Controller
@RequestMapping("/si")
@Scope("request")
public class SessionController {

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
