/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.fcmmmmmm.config 
 * @author: FCmmmmmm   
 * @date: 2018年7月28日 下午12:50:31 
 */
package com.fcmmmmmm.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author FCmmmmmm
 *
 */
public class ConfigM  extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {RootConfig.class};
    }

    //视图、映射等配置文件
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
    
    //文件上传
    @Override
    protected void customizeRegistration(Dynamic registration) {
    	//指定了最大文件大小 请求总大小  存储最大容量临界值 
    	registration.setMultipartConfig(new MultipartConfigElement("/file",2097512,4194304,0));
    }
}