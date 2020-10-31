package com.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public ModelAndView displayWelcomeMessage() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg","Welcome to First Spring Boot Application");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/greet")
	public ModelAndView displayGreetingMessage() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg","Hey , Good Afternoon");
		mv.setViewName("index");
		return mv;
	}

}
