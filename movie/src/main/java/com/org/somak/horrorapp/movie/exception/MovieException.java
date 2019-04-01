package com.org.somak.horrorapp.movie.exception;

public class MovieException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -271806888453342376L;

	private ExceptionBean exception;
	
	public MovieException() {
		super();
	}

	public MovieException(String message) {
		super(message);
	}
	
	public MovieException(ExceptionBean bean) {
		this.exception=bean;
	}

	public ExceptionBean getException() {
		return exception;
	}

	public void setException(ExceptionBean exception) {
		this.exception = exception;
	}
	
	

}
