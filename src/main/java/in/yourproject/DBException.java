package com.hemalatha.exception;

public class DBException extends Exception{

		public DBException(Exception e, String message) {
			super(message, e);
		}
		
	}
