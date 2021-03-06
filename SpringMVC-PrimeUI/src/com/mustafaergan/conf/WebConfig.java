package com.mustafaergan.conf;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.http.HttpServletRequest;

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
public class WebConfig extends WebMvcConfigurerAdapter {
	
	/**
     * statik javascript gibi yapıların tutulacağı yer
     */
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("/**");
        registry.addResourceHandler("/favicon.ico").addResourceLocations("/favicon.ico");
    }
	
	
}