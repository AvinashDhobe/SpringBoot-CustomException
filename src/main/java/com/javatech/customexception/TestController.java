package com.javatech.customexception;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController 
{
	
	@RequestMapping("/api")
	public void msg() throws CustomException
	{
		throw new CustomException();
	}
    dhobe

}
