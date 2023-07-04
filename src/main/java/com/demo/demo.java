package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class demo {
	@GetMapping("/get")
	public String print() {
		return "hi this is my first project";
	}


}
