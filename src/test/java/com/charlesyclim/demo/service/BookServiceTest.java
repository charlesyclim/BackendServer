package com.charlesyclim.demo.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest(BookService.class)
public class BookServiceTest {

	@Autowired
	private BookService service;
	
	@Test
	public void getSum_LeftTest() {
		System.out.println("=============================================");
		System.out.println("Running BookServiceTest.getSum_LeftTest()...");
		System.out.println("=============================================");
		assertEquals(11, service.getSum(4, 7));
		System.out.println("Completed BookServiceTest.getSum_LeftTest()");
	}
}
