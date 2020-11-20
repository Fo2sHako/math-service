package com.hcl.math.service.impl;

import org.springframework.stereotype.Service;

import com.hcl.math.service.NumberService;

@Service
public class NumberServiceImpl implements NumberService {

	@Override
	public void printIntegers() {
		StringBuilder numberStr = new StringBuilder("");
		for(int i = 0; i < 10; i++) {
			if(i != 0) {
				numberStr.append(",");
			}
			numberStr.append(i+1);
		}
		
		System.out.println(numberStr.toString());
	}

}
