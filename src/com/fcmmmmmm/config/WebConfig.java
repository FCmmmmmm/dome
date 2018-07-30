/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.fcmmmmmm.config 
 * @author: FCmmmmmm   
 * @date: 2018年7月28日 下午5:20:37 
 */
package com.fcmmmmmm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
/**
 * @author FCmmmmmm
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.fcmmmmmm.controller")
public class WebConfig extends WebMvcConfigurerAdapter{
	
	@Bean
	public ViewResolver ViewResolver() {
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		return resolver;
	}

	/**
     * 启用spring mvc 的注解（不启用只能通过显示的配置）
     */
	@Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

}
