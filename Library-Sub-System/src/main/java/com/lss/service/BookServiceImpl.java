package com.lss.service;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.lss.entity.Author;
import com.lss.entity.Book;
import com.lss.entity.Publisher;
import com.lss.exceptions.BooksNotAvailable;

@Service
public class BookServiceImpl implements BookService {

	List<Book> booksList;
	
	public BookServiceImpl() {
		createBooks();
	}
	
	@Override
	public Map<String, Object> getPurgeBooks() {
		
		return null;
	}

	@Override
	public Map<String, Object> getSortedBooks() throws Exception {
		Map<String,Object> response = new HashMap<>();
		
	List<Book> sortedBooks=  booksList.stream().sorted(Comparator.comparing(Book::getReleaseDate)
			.reversed())
			.collect(Collectors.toList());
	
				
		if(sortedBooks.isEmpty())
			throw new BooksNotAvailable();
		response.put("data-raw", sortedBooks);
		
		return response;
		
	}

	
	public void createBooks() {
		booksList= new ArrayList<>();
		Author gillbert = new Author();
		gillbert.setAuthorId(1);
		gillbert.setAuthorName("Gillbert");
		
		Publisher oxfordPress = new Publisher();
		oxfordPress.setPublisherId(101);
		oxfordPress.setPublisherName("Oxford Press");
		
		Book book1 = new Book();
		book1.setBookId(1001);
		book1.setTitel("Java");
		book1.setReleaseDate(LocalDate.of(2021, 12, 22));
		book1.setAuthors(gillbert);
		book1.setPublishers(oxfordPress);
		
		Book book2 = new Book();
		book2.setBookId(1002);
		book2.setTitel("Java");
		book2.setReleaseDate(LocalDate.of(2021, 12, 2));
		book2.setAuthors(gillbert);
		book2.setPublishers(oxfordPress);
		
		booksList.add(book1);
		booksList.add(book2);
	}
}
