package com.mustafaergan.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
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
@Scope("prototype")
public class HelloService {
	
	String message = "Selam Dostlar";
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
}
