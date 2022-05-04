package com.home.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(UserDataAccessException.class)
	@ResponseBody
	public final ResponseEntity<ErrorResponse> handleUserNotFoundException(UserDataAccessException accessException,
			WebRequest request) {
		ErrorResponse details = new ErrorResponse(accessException.getLocalizedMessage(), accessException.getLocalizedMessage());

		return new ResponseEntity<ErrorResponse>(details, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception exception, WebRequest request) {
		ErrorResponse details = new ErrorResponse(exception.getLocalizedMessage(), request.getDescription(false));

		return new ResponseEntity<Object>(details, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
