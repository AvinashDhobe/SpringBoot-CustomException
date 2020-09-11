package com.javatech.customexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler 
{
	@ExceptionHandler(CustomException.class)
	public ResponseEntity<Object> myMsg(CustomException c)
	{
		return new ResponseEntity<>(c.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);	
	}
}

