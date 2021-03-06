package com.rclgroup.com.demo;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

//THESE 2 LINES WILL START SPRING, CALLED SPRINT CONTEXT
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)

public class AddControllerMockTest {
	
	@MockBean
	private AddOperation addOperation;
	
	@Autowired
	private TestRestTemplate rest;	

	@Test
	public void test() {
		
		initMocks(this);
		
		given(addOperation.addOperation(1, 1)).willReturn(2.0);
		
		String result = rest.getForObject("/add/1/1", String.class);
		
		assertEquals("2.0", result);
	}

}
