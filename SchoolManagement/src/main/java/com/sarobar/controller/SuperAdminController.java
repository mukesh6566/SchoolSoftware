package com.sarobar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SuperAdminController {
	@RequestMapping(value="/admin/form",method=RequestMethod.GET)
	public String loginForm()
	{
		return "adminlogin";
	}
	@RequestMapping(value="/admin/login",method=RequestMethod.POST)
	public String adminLogin(@RequestParam("email") String email,@RequestParam("pass") String pass)
	{
		if(email.equals("mk@gmail.com")&&pass.equals("123"))
		{
			///return "redirect:/test/test.jsp";
			return "redirect:/welcome/form";
		}
		else
		{
			return "adminlogin";
		}
	}
	
	@RequestMapping(value="/welcome/form",method=RequestMethod.GET)
	public String showWelcomeForm()
	{
		return "welcome";
	}
	

}
