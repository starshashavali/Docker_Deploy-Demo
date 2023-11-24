package com.tcs.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class MsgRestController {
	
	@GetMapping("/")
	public String getMsg() {
		return "Welcome to docker World";
	}
	@GetMapping("/msg")
	public String getMessage() {
		return "Welcome to docker World";
	}
}
