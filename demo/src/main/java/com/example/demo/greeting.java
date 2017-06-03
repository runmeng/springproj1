package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class greeting {

	@RequestMapping("/greeting")
	public @ResponseBody String greet(){
		return "Hello World";
	}
	
}
