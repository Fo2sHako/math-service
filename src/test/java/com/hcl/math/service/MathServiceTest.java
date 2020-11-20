package com.hcl.math.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MathServiceTest {
	
	@Autowired
	MathService mathServiceImpl;

	@Test
	void calculateAreaWithZerosShouldThrowException() {
		//GIVEN
		

		//WHEN
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
	       mathServiceImpl.getTriangleArea(0, 0);
	    }); 
		
		//THEN
		assertEquals("Inavlid Input for 0.0 and 0.0", exception.getMessage());
	}
	
	@Test
	void calculateAreaWithMinusShouldThrowException() {
		//GIVEN
		

		//WHEN
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
	       mathServiceImpl.getTriangleArea(-10.6, 8);
	    }); 
		
		//THEN
		assertEquals("Inavlid Input for -10.6 and 8.0", exception.getMessage());
	}
	
	@Test
	void calculateAreaWithValidInputShouldSuccess() {
		//GIVEN
		

		//WHEN
		double actual = mathServiceImpl.getTriangleArea(10.0, 8.7).get();
		
		//THEN
		assertEquals(43.5, actual);
	}

}
