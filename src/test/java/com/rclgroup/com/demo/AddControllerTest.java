package com.rclgroup.com.demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;


//THESE 2 LINES WILL START SPRING, CALLED SPRINT CONTEXT
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class AddControllerTest {

	@Autowired
	private TestRestTemplate rest;	
	
	@Test
	public void case1() {
		
		String result = rest.getForObject("/add/1/1", String.class);
		
		assertEquals("2.0", result);
	}

}
