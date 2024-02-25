package com.codemind.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

	@GetMapping("/dummy")
	public String getMessage() {
		return " hello kiran implementing swagger api";
	}
}
