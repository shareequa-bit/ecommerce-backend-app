package com.ecommerce.orders.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler({OrderException.class})
	public ResponseEntity<Object> handleOrderNotFoundException(OrderException exception){
		 return ResponseEntity
	                .status(HttpStatus.BAD_REQUEST)
	                .body(exception.getMessage());
		
		
	}

}
