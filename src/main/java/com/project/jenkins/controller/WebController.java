package com.project.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class WebController {
	@GetMapping("/")
	public String home()
	{
		return "welcome to jenkins";
	}

}
