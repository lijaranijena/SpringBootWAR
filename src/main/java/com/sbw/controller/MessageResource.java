package com.sbw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MessageResource {
	
	
	@GetMapping("/msg")
	public String getMessage(){
		return "hello";
	}

}
