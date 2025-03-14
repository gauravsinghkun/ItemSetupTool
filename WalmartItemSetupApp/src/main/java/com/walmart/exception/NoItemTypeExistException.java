package com.walmart.exception;

public class NoItemTypeExistException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoItemTypeExistException(String message) {
		super(message);
		System.out.println("NoItemTypeExistException.NoItemTypeExistException()");
	}
}
