package com.hcl.math.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hcl.math.service.MathService;

@Service
public class MathServiceImpl implements MathService{

	@Override
	public Optional<Double> getTriangleArea(double height, double base){

		//if the values are not valid through 
		if(height <= 0 || base <= 0) {
			throw new IllegalArgumentException("Inavlid Input for " + height + " and " + base);
		}
		
		Double area = 0.5*height*base;
		Optional<Double> oArea = Optional.of(area);
		
		return oArea;
		
	}
}
