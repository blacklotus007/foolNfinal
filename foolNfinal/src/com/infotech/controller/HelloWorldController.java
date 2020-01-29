package com.infotech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.infotech.service.serviceprovider;

@Controller
@RequestMapping(value="/")
public class HelloWorldController {
@Autowired	
private serviceprovider provider;
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView welcome()
	{
		return new ModelAndView("welcomePage","welcomeMessage",provider.hello());
		
	}
		
		@RequestMapping(value = "thanks",method=RequestMethod.GET) 
		public ModelAndView thankyou()
		{
			return new ModelAndView("welcomePage","welcomeMessage",provider.hii());
		}
	
}
