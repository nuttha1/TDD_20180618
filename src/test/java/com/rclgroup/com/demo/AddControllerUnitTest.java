package com.rclgroup.com.demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;

import com.rclgroup.com.AddOperation;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.mockito.BDDMockito.given;

public class AddControllerUnitTest {
	
	@Mock
	private AddOperation addOperation;

	@Test
	public void test() {

		initMocks(this);
		
		given(addOperation.addOperation(1, 2)).willReturn(3.0);
		
		AddController controller = new AddController();
		controller.setOper(addOperation);
		
		String actualresult = controller.add(1, 2);
		
		assertEquals("3.0", actualresult);
	}

}
