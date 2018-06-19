package com.rclgroup.com.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddNumberTest {

	@Test
	public void caseAdd() {
		
		AddOperation oper = new AddOperation();
		
		double actualResult = oper.addOperation(1, 3);
		
		assertEquals(4, actualResult, 0.00);
	}

}
