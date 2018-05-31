package com.charlesyclim.demo.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class BookDto implements Serializable {
	
	private Long id;
	private String isdn;
	private String author;
	private String bookTitle;
}
