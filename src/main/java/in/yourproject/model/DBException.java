package in.yourproject.model;

public class DBException extends Exception{

		public DBException (Exception e, String message) {
			super(message, e);
		}
		
	}