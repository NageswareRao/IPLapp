package com.concentrix.ipl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginContrller {
	
	@RequestMapping({"/" , "home"})
	public String home() {
		return "home";
	}
	
	@PostMapping("/adminLogin")
	public ModelAndView loginAuthentication(String userName, String passWord) {
		
		ModelAndView mv = new ModelAndView();
		String user = "admin";
		String passW = "admin@123";
		if(userName.equals(user) && passWord.equals(passW)) {
			mv.setViewName("adminPage");
		}
		else {
			mv.setViewName("invalidCredentials");
		}
		return mv;
			
	}

}
