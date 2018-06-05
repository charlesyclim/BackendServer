package com.charlesyclim.demo.controllers;


import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit4.SpringRunner;

import com.charlesyclim.demo.controllers.BookController;
import com.charlesyclim.demo.dto.BookDto;
import com.charlesyclim.demo.service.BookService;

@RunWith(SpringRunner.class)
@JsonTest
public class BookControllerTest {

	@Autowired
	private JacksonTester<BookDto> json;
	
	@Test
    public void serializeJson() throws IOException {
		BookDto dto = new BookDto();
		dto.setId(223L);
		dto.setAuthor("John Peterson");
		dto.setBookTitle("Buy a mockingbird");
		dto.setIsdn("ISDN:22344449933");
        assertThat(this.json.write(dto))
            .extractingJsonPathStringValue("@.author")
            .isEqualTo("John Peterson");
    }
}
