package com.example.demo.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("get")
	public String display() {
		System.out.println("Hello i m here00000");

		return "Hello Jenkins ,How are you.888";

	}
}
