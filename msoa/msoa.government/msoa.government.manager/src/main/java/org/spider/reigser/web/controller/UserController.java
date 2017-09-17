
package org.spider.reigser.web.controller;

import org.spider.reigser.web.entity.User;
import org.spider.reigser.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * <p>Title:UserController.java</p>
 * <p>Description:</p>
 * <p>Company:</p>
 * @author HuangMai
 * @Version 1.0
 * 
 */

@Controller
@RequestMapping("/login")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/userLogin")
	public ModelAndView userLogin(String uname,String upwd){
		ModelAndView mav=new ModelAndView();
		User user=userService.login(uname, upwd);
		if(user!=null){
			mav.setViewName("/success");
			return mav;
		}else{
			mav.setViewName("/fail");
			return mav;
		}
	}

}

