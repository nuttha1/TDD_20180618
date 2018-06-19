package com.rclgroup.com.demo;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.rclgroup.com.AddOperation;

@RunWith(Parameterized.class)
public class AddNumberTestParameterized {
	
	private int int1;
	private int int2;
	private double expectedResult;

	public AddNumberTestParameterized(int int1, int int2, double expectedResult) {
		this.int1 = int1;
		this.int2 = int2;
		this.expectedResult = expectedResult;
	}

	@Test
	public void test() {
		
		AddOperation oper = new AddOperation();
		
		double actualResult = oper.addOperation(this.int1, this.int2);
		
		assertEquals(this.expectedResult, actualResult, 0.00);
	}
	
	@Parameters
	public static List<Object> data() {		
		
		return Arrays.asList(new Object[][] {			
			{1, 1, 2.0}, 
			{2, 3, 4.0}
		});
	}

}
