package com.hcl.math.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NumberServiceTest {
	
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	@Autowired
	NumberService numberService;
	
	@Test
	void printIntegersShouldSucces() {
		//GIVEN
		System.setOut(new PrintStream(outputStreamCaptor));
		
		//WHEN
		numberService.printIntegers();
		
		//THEN
		assertEquals("1,2,3,4,5,6,7,8,9,10", outputStreamCaptor.toString().trim());
	}

}
