package com.lss.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lss.service.BookService;



@RestController
@RequestMapping(value = "api/v1/library/")
public class BookController {
	
	@Autowired
	private BookService bookService;

	@GetMapping("sorted-books")
	public ResponseEntity<Map<String, Object>> sortedBooks() {
		ResponseEntity<Map<String, Object>> response;
		try {
			response = new ResponseEntity<>(bookService.getSortedBooks(),HttpStatus.OK);
		}
		catch(Exception e){
			response= new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return response;
	}
	
	@PostMapping("purge-book")
	public ResponseEntity<Map<String, Object>> purgeBooks() {
		ResponseEntity<Map<String, Object>> response;
		try {
			response = new ResponseEntity<>(bookService.getPurgeBooks(),HttpStatus.OK);
		}
		catch(Exception e){
			response= new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return response;
	}
}
