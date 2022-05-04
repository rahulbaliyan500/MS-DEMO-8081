package com.home.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserDataAccessException extends RuntimeException {

	private String errorMessage;
	private String errorReason;

	private static final long serialVersionUID = -6160432522589091725L;

	public UserDataAccessException(String errorMessage, String errorReason) {
		super();
		this.errorMessage = errorMessage;
		this.errorReason = errorReason;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorReason() {
		return errorReason;
	}

	public void setErrorReason(String errorReason) {
		this.errorReason = errorReason;
	}

}
