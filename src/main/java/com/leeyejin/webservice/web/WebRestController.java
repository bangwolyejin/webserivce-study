package com.leeyejin.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

	@GetMapping("testpage")
	public String test() 
	{
		return "testpage";
	}
}
