package com.rclgroup.com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rclgroup.com.AddOperation;

@RestController
public class AddController {
	
	@Autowired
	private AddOperation oper;
	
	
	
	public void setOper(AddOperation oper) {
		this.oper = oper;
	}



	@GetMapping("/add/{i1}/{i2}")
	public String add(@PathVariable int i1
					 , @PathVariable  int i2) {

		double result = oper.addOperation(i1, i2);
		
		return String.valueOf(result);
		
		
	}

}
