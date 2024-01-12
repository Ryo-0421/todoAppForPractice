package com.example.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.domain.user.model.MTodo;
import com.example.domain.user.service.TodoService;
import com.example.form.TodoForm;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TodoDetailController {
	
	@Autowired
	private TodoService service;
	
	@Autowired
	private ModelMapper mapper;

	@GetMapping("detail/{id}")
	public String getTodoDetail(@PathVariable("id") int id, TodoForm form, Model model) {
		
		MTodo todo = this.service.getTodo(id);
		
		form = this.mapper.map(todo, TodoForm.class);
		
		model.addAttribute("todoForm", form);
		
		return "tododetails";
	}
	
	@PostMapping("detail")
	public String postTodoDetail(Model model, @ModelAttribute @Validated TodoForm form, BindingResult result) {
		
		if (result.hasErrors()) {
			return "todoDetails";
		}
		
		this.service.updateTodo(form.getId(), form.getTitle(), form.getIsDone(), form.getTimeLimit());
		
		return "redirect:/";
	}
}
