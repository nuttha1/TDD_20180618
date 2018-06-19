package com.rclgroup.com;

public class DivideOperation {
	
	public double divideOperation(int int1, int int2) throws DivideOperationException {
		
		if (int2 == 0) {
			throw new DivideOperationException();
		}
		
		return int1/int2;
	}

}
