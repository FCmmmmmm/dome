/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.fcmmmmmm.config 
 * @author: FCmmmmmm   
 * @date: 2018年7月28日 下午5:20:37 
 */
package com.fcmmmmmm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ITemplateResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
/**
 * @author FCmmmmmm
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.fcmmmmmm.controller")
public class WebConfig extends WebMvcConfigurerAdapter{
	/*
	 * enable with thymeleaf
	 * 2018/7/31
	 */
	/**
     * 启用spring mvc 的注解（不启用只能通过显示的配置）
     */
	@Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

	
	@Bean
	public SpringResourceTemplateResolver templateResolver() {
		SpringResourceTemplateResolver templateResolver=new SpringResourceTemplateResolver(); 
		templateResolver.setPrefix("/WEB-INF/templates/");
		templateResolver.setSuffix(".html");
		templateResolver.setCharacterEncoding("utf-8");
		// templateResolver.setCharacterEncoding("UTF-8");
		// 设置模板模式,也可用字符串"HTML"代替,此处不建议使用HTML5,原因看下图源码
		templateResolver.setTemplateMode(TemplateMode.HTML);
		return templateResolver;
	}
	@Bean // 生成模板引擎并为模板引擎注入模板解析器
	public TemplateEngine templateEngine(SpringResourceTemplateResolver templateResolver) {
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		templateEngine.setTemplateResolver(templateResolver);
		return templateEngine;
	}
 
	@Bean // 生成视图解析器并未解析器注入模板引擎
	public ViewResolver viewResolver(TemplateEngine templateEngine) {
		ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
		viewResolver.setTemplateEngine(templateEngine);
		viewResolver.setCharacterEncoding("utf-8");
		return viewResolver;
	}
	
	@Bean	//文件上传解析器  
	public MultipartResolver multipartResolver() {
		//StandardServletMultipartResolver CommonsMultipartResolver  servlet 3.0
		return new StandardServletMultipartResolver();
	}

}
