package com.example.domain.user.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MTodo {
	private Integer id;
	private String title;
	private Boolean isDone;
	private LocalDate timeLimit;
}
