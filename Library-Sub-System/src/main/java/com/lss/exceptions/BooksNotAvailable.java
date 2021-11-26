package com.lss.exceptions;

public class BooksNotAvailable extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BooksNotAvailable() {
		super("Books Not Avaliable in List");
	}
	
	public BooksNotAvailable(String msg) {
		super(msg);
	}
}
