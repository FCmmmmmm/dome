/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.fcmmmmmm.test 
 * @author: FCmmmmmm   
 * @date: 2018年7月30日 下午4:44:14 
 */
package com.fcmmmmmm.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fcmmmmmm.controller.HomeController;

/**
 * @author FCmmmmmm
 *
 */
public class HomeControllerTest {
	@Test
	public void testHomeController() {
		HomeController homeController = new HomeController();
		MockMvc mvc = MockMvcBuilders.standaloneSetup(homeController).build();
		try {
			mvc.perform(get("/do")).andExpect(view().name("index"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
