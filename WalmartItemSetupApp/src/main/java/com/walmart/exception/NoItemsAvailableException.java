package com.walmart.exception;

public class NoItemsAvailableException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoItemsAvailableException(String message) {
		super(message);
		System.out.println("NoItemTypeExistException.NoItemTypeExistException()");
	}
}
