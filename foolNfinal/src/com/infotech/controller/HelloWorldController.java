package com.infotech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.infotech.service.serviceprovider;

@Controller
@RequestMapping(value="/")
public class HelloWorldController {
@Autowired	
private serviceprovider provider;
	@RequestMapping(value = "/nishant/{username}/{age}",method=RequestMethod.GET)
	public ModelAndView welcome(@PathVariable("username") String username,@PathVariable("age") int age)
	{
		return new ModelAndView("welcomePage","welcomeMessage","My name is "+username+" and my age is "+age);
		
	}
		
		@RequestMapping(value = "thanks",method=RequestMethod.GET) 
		public ModelAndView thankyou(@RequestParam("you") int you)
		{
			return new ModelAndView("welcomePage","welcomeMessage",provider.hii() +" "+you);
		}
	
}
