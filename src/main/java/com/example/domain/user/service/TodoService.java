package com.example.domain.user.service;

import java.util.List;

import com.example.domain.user.model.MTodo;

public interface TodoService {
	
	 List<MTodo> findCompleteTodo();
	 
	 List<MTodo> findIncompleteTodo();
	 
	 void insertTodo(MTodo todo);
}
