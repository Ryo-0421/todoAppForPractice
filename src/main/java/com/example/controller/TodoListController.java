package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.domain.user.model.MTodo;
import com.example.domain.user.service.TodoService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TodoListController {
	
	@Autowired
	private TodoService todoService;
	
	@GetMapping("/")
	public String getTodolist(Model model) {
		List<MTodo> CompleteList = this.todoService.findCompleteTodo();
		List<MTodo> IncompleteList = this.todoService.findIncompleteTodo();
		model.addAttribute("CompleteList", CompleteList);
		model.addAttribute("incompleteList", IncompleteList);
		return "todolist";
	}
}
