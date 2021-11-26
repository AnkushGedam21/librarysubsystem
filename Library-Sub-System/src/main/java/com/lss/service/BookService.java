package com.lss.service;

import java.util.Map;

public interface BookService {

	public Map<String, Object> getPurgeBooks();
	public Map<String, Object> getSortedBooks() throws Exception;
	
}
