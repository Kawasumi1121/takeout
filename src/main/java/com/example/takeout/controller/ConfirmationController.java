package com.example.takeout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConfirmationController {

	@GetMapping(path = "/confirmation")
	public String index() {
		return "confirmation/index";
	}
}