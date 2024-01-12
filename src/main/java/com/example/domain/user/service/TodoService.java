package com.example.domain.user.service;

import java.time.LocalDate;
import java.util.List;

import com.example.domain.user.model.MTodo;

public interface TodoService {
	
	 List<MTodo> findCompleteTodo();
	 
	 List<MTodo> findIncompleteTodo();
	 
	 void insertTodo(MTodo todo);
	 
	 void updateTodo(int id, String title, Boolean isDone, LocalDate localDate);
	 
	 MTodo getTodo(int id);
}
