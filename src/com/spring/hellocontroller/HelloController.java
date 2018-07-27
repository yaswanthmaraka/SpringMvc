package com.spring.hellocontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/welcome")
public class HelloController {
	
	@RequestMapping("/welcome/{countryName}/{userName}")
	public ModelAndView helloworld(@PathVariable Map<String ,String> pathVars) {
		String name=pathVars.get("userName");
		String country=pathVars.get("countryName");
		
		ModelAndView mv=new ModelAndView("Hello");
		mv.addObject("msg"," hello "  +    name   +    " you are from "   +   country);
		
		return mv;
		
	}
	
	
		
		


}
