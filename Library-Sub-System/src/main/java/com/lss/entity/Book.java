package com.lss.entity;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Book {

	private long bookId;
	private String isbnCode;
	private String titel;
	private LocalDate releaseDate;
	private List<Author> authors;
	private List<Publisher> publishers;
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getIsbnCode() {
		return isbnCode;
	}
	public void setIsbnCode(String isbnCode) {
		this.isbnCode = isbnCode;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(Author authors) {
		if(this.authors == null)
			this.authors = new ArrayList<>();
		this.authors.add(authors);
	}
	public List<Publisher> getPublishers() {
		return publishers;
	}
	public void setPublishers(Publisher publishers) {
		if(this.publishers == null)
			this.publishers=new ArrayList<>();
		this.publishers.add(publishers);
	}
	public Book(long bookId, String isbnCode, String titel, LocalDate releaseDate, List<Author> authors,
			List<Publisher> publishers) {
		super();
		this.bookId = bookId;
		this.isbnCode = isbnCode;
		this.titel = titel;
		this.releaseDate = releaseDate;
		this.authors = authors;
		this.publishers = publishers;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", isbnCode=" + isbnCode + ", titel=" + titel + ", releaseDate=" + releaseDate
				+ ", authors=" + authors + ", publishers=" + publishers + "]";
	}
	
	
	
}
