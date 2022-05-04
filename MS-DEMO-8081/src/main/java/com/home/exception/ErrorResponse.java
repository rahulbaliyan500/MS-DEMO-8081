package com.home.exception;

public class ErrorResponse {
	private String message;
	private String errorReason;

	ErrorResponse(String message, String errorReason) {
		super();
		this.message = message;
		this.errorReason = errorReason;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorReason() {
		return errorReason;
	}

	public void setErrorReason(String errorReason) {
		this.errorReason = errorReason;
	}
}
