package com.charlesyclim.demo.service;

import org.springframework.stereotype.Service;

@Service
public class BookService {

	public int getSum(int val1, int val2) {
		return val1 + val2;
	}
}
