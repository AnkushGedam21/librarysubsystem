package com.lss.entity;

import java.util.Date;

public class Author {

	private long authorId;
	private String authorName;
	private Date dob;
	private String biographicalIntroduction;
	public long getAuthorId() {
		return authorId;
	}
	public void setAuthorId(long authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getBiographicalIntroduction() {
		return biographicalIntroduction;
	}
	public void setBiographicalIntroduction(String biographicalIntroduction) {
		this.biographicalIntroduction = biographicalIntroduction;
	}
	public Author(long authorId, String authorName, Date dob, String biographicalIntroduction) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.dob = dob;
		this.biographicalIntroduction = biographicalIntroduction;
	}
	public Author() {
		super();
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + ", dob=" + dob
				+ ", biographicalIntroduction=" + biographicalIntroduction + "]";
	}
	
	
}
