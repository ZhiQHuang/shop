package cn.edu.hbpu.shop.util;

public class MyException extends Exception {
	private String message;

	public MyException(String message) {
		super();
		this.message = message;
	}

	public MyException() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
