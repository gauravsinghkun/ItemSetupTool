package com.walmart.errorClass;

public class ErrorDetails {

	private Integer errorId;
	private String errorValue;

	public ErrorDetails() {
		System.out.println("ErrorDetails.ErrorDetails()");
	}

	public Integer getErrorId() {
		return errorId;
	}

	public void setErrorId(Integer errorId) {
		this.errorId = errorId;
	}

	public String getErrorValue() {
		return errorValue;
	}

	public void setErrorValue(String errorValue) {
		this.errorValue = errorValue;
	}

	@Override
	public String toString() {
		return "ErrorDetails [errorId=" + errorId + ", errorValue=" + errorValue + "]";
	}

}
