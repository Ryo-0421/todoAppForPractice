package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoDetailController {

	@GetMapping("detail")
	public String getTodoDetail() {
		return "tododetails";
	}
}
