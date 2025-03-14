package com.walmart.globalExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.walmart.errorClass.ErrorDetails;
import com.walmart.exception.FulfilledPartyNotAvailableException;
import com.walmart.exception.NoItemTypeExistException;
import com.walmart.exception.NoItemsAvailableException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = FulfilledPartyNotAvailableException.class)
	public ResponseEntity<ErrorDetails> exception_1(FulfilledPartyNotAvailableException exception) {
		ErrorDetails errorDetails = new ErrorDetails();
		errorDetails.setErrorId(HttpStatus.INTERNAL_SERVER_ERROR.value());
		errorDetails.setErrorValue(exception.getMessage());
		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.OK);
	}

	@ExceptionHandler(value = NoItemsAvailableException.class)
	public ResponseEntity<ErrorDetails> exception_2(NoItemsAvailableException exception) {
		ErrorDetails errorDetails = new ErrorDetails();
		errorDetails.setErrorId(HttpStatus.INTERNAL_SERVER_ERROR.value());
		errorDetails.setErrorValue(exception.getMessage());
		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.OK);
	}

	@ExceptionHandler(value = NoItemTypeExistException.class)
	public ResponseEntity<ErrorDetails> exception_3(NoItemTypeExistException exception) {
		ErrorDetails errorDetails = new ErrorDetails();
		errorDetails.setErrorId(HttpStatus.INTERNAL_SERVER_ERROR.value());
		errorDetails.setErrorValue(exception.getMessage());
		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.OK);
	}
}
