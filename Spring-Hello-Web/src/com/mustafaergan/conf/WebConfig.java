package com.mustafaergan.conf;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 
 * mvc-dispatcher-servlet.xml
 * karşılık gelmektedir.
 *
 */


@EnableWebMvc
@Configuration
@Import(ViewConfig.class)
@ComponentScan(basePackages = {"com.mustafaergan"})
public class WebConfig {

	
	//Buradan da scope ayarlaması yapilabilirdi
	
//    @Bean
//    public HelloController helloController () {
//        return new HelloController();
//    }
//
//    @Bean
//    @Scope(WebApplicationContext.SCOPE_SESSION)
//    public HelloController hello(HttpServletRequest request){
//         return new HelloController(request.getRemoteAddr());
//    }
}