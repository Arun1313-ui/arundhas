package com.Email.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class Controllerpart {
	@RequestMapping("/hello")
	public String display()
	{
		return ("<h1>Hello Everyone!</h1>");
	}
	
	@RequestMapping("/user")
	public String user()
	{
		return ("<h1>Hello User!</h1>");
	}
	
	@RequestMapping("/admin")
	public String admin()
	{
		return ("<h1>Hello Admin!</h1>");
	}

}
