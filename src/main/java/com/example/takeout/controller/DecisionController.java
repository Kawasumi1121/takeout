package com.example.takeout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DecisionController {

	@GetMapping(path = "/decision")
	public String index() {
		return "decision/index";
	}
}