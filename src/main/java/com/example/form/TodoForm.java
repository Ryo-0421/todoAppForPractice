package com.example.form;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TodoForm {
	private Integer id;
	@NotBlank
	@Size(min = 1, max = 40)
	private String title;
	private Boolean isDone;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@NotNull
	private LocalDate timeLimit;
}
