package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoListController {
	
	@GetMapping("/")
	public String getTodolist() {
		return "todolist";
	}
}
