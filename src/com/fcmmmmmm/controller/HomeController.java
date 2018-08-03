/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.fcmmmmmm.controller 
 * @author: FCmmmmmm   
 * @date: 2018年7月30日 上午9:23:52 
 */
package com.fcmmmmmm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author FCmmmmmm
 *
 */
@Controller
public class HomeController {

	@RequestMapping(value = "/do", method = RequestMethod.GET)
	public String getHome() {
		return "index";
	}

	@RequestMapping("/home")
	public String hello() {
		// return with json
		return "home";
	}

	@RequestMapping("/filehome")
	public String fileHome() {
		return "fileupload";
	}
}
