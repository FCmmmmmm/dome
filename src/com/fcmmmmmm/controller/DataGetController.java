/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.fcmmmmmm.controller 
 * @author: FCmmmmmm   
 * @date: 2018年7月30日 下午6:08:49 
 */
package com.fcmmmmmm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FCmmmmmm
 *
 */
@RestController
public class DataGetController {
	
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String getList(@RequestParam(value="start",defaultValue="10")int start,
			@RequestParam(value="end",defaultValue="10")int end)
	{
		//return rep.findDataByIndex(start, end).toString();
		return start-end+"";
	}
}
