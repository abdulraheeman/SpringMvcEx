package com.ar.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
  
	@RequestMapping("/test")
	public ModelAndView test() {
		String str="Welcome to Spring Mvc";
		return new ModelAndView("testex", "msg", str);
	}
}
