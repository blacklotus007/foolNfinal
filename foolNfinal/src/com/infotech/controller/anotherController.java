package com.infotech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class anotherController {
	
	@RequestMapping(value="/listusers")
	public ModelAndView getList()
	{
		return new ModelAndView("listName","listData","List is here");
	}
// 
//	@RequestMapping("/listupdated")
//	public ModelAndView getUpdatedList()
//	{
//		return new ModelAndView("listName","listUpdatedData","List is updated");
//	}
//	@RequestMapping("/listdeleted")
//	public ModelAndView getDeletedList()
//	{
//		return new ModelAndView("listName","listDeletedData","List is Deleted");
//	}

}
