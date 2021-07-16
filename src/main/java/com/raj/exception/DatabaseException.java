package com.raj.exception;

public class DatabaseException extends Exception{

	public DatabaseException(Exception e, String message) {
		super(message, e); 
	}
}
