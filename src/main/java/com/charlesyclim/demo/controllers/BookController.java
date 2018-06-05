package com.charlesyclim.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.charlesyclim.demo.dto.BookDto;
import com.charlesyclim.demo.service.BookService;

@RequestMapping(value="/books")
@RestController
public class BookController {

	@Autowired
	private BookService service;
	
	@GetMapping
	public BookDto getDto() {
		BookDto dto = new BookDto();
		dto.setId(123L);
		dto.setAuthor("Charles Lim");
		dto.setIsdn("ISDN: 223333322332211");
		dto.setBookTitle("Missing Jewels" + service.getSum(53, -22));
		return dto;
	}
}
