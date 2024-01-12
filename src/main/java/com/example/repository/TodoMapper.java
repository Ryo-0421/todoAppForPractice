package com.example.repository;

import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.domain.user.model.MTodo;

@Mapper
public interface TodoMapper {
	
	public List<MTodo> getCompleteList();
	
	public List<MTodo> getIncompleteList();
	
	public void insertOneTodo(MTodo todo);
	
	public void updateOneTodo(@Param("id")int id, @Param("title") String title, @Param("isDone") Boolean isDone, @Param("timeLimit") LocalDate timeLimit);
	
	public MTodo getOneTodo(int id);
}
