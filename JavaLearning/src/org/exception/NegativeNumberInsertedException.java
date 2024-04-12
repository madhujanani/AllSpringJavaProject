package org.exception;

public class NegativeNumberInsertedException extends Exception {


		/**
	 * 
	 */   
	private static final long serialVersionUID = 1L;

		@Override 
		public String getMessage() {
			String msg ="There is a negative input value at ";
			return msg;
			
		}
		
		
	

}
