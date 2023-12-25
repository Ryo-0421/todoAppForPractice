package com.example.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.domain.user.model.MTodo;
import com.example.domain.user.service.TodoService;
import com.example.form.TodoForm;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
public class AddTodoController {
	
	@Autowired
	private TodoService todoService;
	
	@Autowired
	private ModelMapper mapper;
	
	@GetMapping("/add")
	public String getAddTodo(@ModelAttribute TodoForm form) {
		return "addtodo";
	}
	
	@PostMapping("/add")
	public String postAddTodo(@ModelAttribute @Validated TodoForm form, BindingResult result) {
		
		if (result.hasErrors()) {
			return "addtodo";
		}
		
		MTodo todo = mapper.map(form, MTodo.class);
		
		this.todoService.insertTodo(todo);
		
		log.info(form.toString());
		return "redirect:/";
	}
}
