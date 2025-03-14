package com.walmart.exception;

public class FulfilledPartyNotAvailableException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FulfilledPartyNotAvailableException(String message) {
		super(message);
		System.out.println("NoItemTypeExistException.NoItemTypeExistException()");
	}
}
