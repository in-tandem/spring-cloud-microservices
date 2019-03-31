package com.org.somak.horrorapp.monster.exception;

public class MonsterException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -271806888453342376L;

	private ExceptionBean exception;
	
	public MonsterException() {
		super();
	}

	public MonsterException(String message) {
		super(message);
	}
	
	public MonsterException(ExceptionBean bean) {
		this.exception=bean;
	}

	public ExceptionBean getException() {
		return exception;
	}

	public void setException(ExceptionBean exception) {
		this.exception = exception;
	}
	
	

}
