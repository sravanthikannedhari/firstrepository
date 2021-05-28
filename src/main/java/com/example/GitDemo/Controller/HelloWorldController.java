package com.example.GitDemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
	
	@GetMapping("/hello")
	public String hello()
	{
		return "Hello World";
	}

}
