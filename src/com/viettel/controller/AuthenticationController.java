package com.viettel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.viettel.util.LogUtils;

@Controller
public class AuthenticationController {

	@RequestMapping("/register")
	public ModelAndView register() {
		LogUtils.d("register", "/register");
		String message = "Hello World, Spring MVC @ Javatpoint";
		return new ModelAndView("register", "message", message);
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
		LogUtils.d("register", "/register");
		String message = "Hello World, Spring MVC @ Javatpoint";
		return new ModelAndView("login", "message", message);
	}
	
	@RequestMapping("/forgotPassword")
	public ModelAndView forgotPassword() {
		LogUtils.d("register", "/register");
		String message = "Hello World, Spring MVC @ Javatpoint";
		return new ModelAndView("forgotPassword", "message", message);
	}
}
