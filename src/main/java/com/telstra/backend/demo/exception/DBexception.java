package com.telstra.backend.demo.exception;

public class DBexception extends Exception{
	
	private static final long serialVersionUID = 1L;
	private String msg;

	public DBexception() {
		super();
		this.msg = "DB max connection reached";
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
