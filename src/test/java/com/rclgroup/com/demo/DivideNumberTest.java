package com.rclgroup.com.demo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.rclgroup.com.DivideOperation;
import com.rclgroup.com.DivideOperationException;

public class DivideNumberTest {

	@Test(expected=DivideOperationException.class)
	public void test() throws DivideOperationException {
		
		DivideOperation divideExp = new DivideOperation();

		double actualResult = divideExp.divideOperation(2, 0);
		
		assertEquals(1, actualResult, 0.000);
	}
	
	@Test
	public void divide() throws DivideOperationException {
		
		DivideOperation divideExp = new DivideOperation();
		
		double actualResult = divideExp.divideOperation(2, 2);
		
		assertEquals(1, actualResult, 0.000);
	}
	

}
