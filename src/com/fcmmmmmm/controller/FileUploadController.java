/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.fcmmmmmm.controller 
 * @author: FCmmmmmm   
 * @date: 2018年8月2日 上午10:39:51 
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
@RequestMapping("/upload")
public class FileUploadController {
	
	@RequestMapping(value = "/file", method = RequestMethod.POST)
	public String file() {	
		//MultipartFile multipartFile=
		//MultipartFile imgFile =request.getFile("img");
		/*if (request instanceof MultipartHttpServletRequest) {

			MultipartHttpServletRequest multipartHttpServletRequest =
					(MultipartHttpServletRequest) request;
			// 获得第1张图片（根据前台的name名称得到上传的文件）
			MultipartFile imgFile1 = multipartHttpServletRequest.getFile("img");

			String name = imgFile1.getName();
			File file = new File("/file/"+name+"jpg");
			try {
				imgFile1.transferTo(file);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "fileupload";
	}*/
		return "fileupload";
}
}