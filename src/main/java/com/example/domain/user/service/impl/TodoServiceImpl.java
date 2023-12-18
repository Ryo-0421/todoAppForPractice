package com.example.domain.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.user.model.MTodo;
import com.example.domain.user.service.TodoService;
import com.example.repository.TodoMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {
	
	@Autowired
	private TodoMapper todoMapper;
	
	@Override
	public List<MTodo> findCompleteTodo() {
		return this.todoMapper.getCompleteList();
	}
	
	@Override
	public List<MTodo> findIncompleteTodo() {
		return this.todoMapper.getIncompleteList();
	}
}
