package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.user.model.MTodo;

@Mapper
public interface TodoMapper {
	
	public List<MTodo> getCompleteList();
	
	public List<MTodo> getIncompleteList();
	
	public void insertOneTodo(MTodo todo);
}
