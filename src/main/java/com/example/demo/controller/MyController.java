package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class MyController 
{
	
	@RequestMapping("/demo")
	
	@ResponseBody
	String myfun()
	{
		return "hello world"
				+ "<a href='index.html'>home page</a>";
		
	}

}
