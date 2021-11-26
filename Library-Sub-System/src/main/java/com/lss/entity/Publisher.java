package com.lss.entity;

import java.util.List;

public class Publisher {

	private long publisherId;
	private String publisherName;
	private String publisherAddress;
	private long phoneNumber;
	private List<String> countries;
	public long getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(long publisherId) {
		this.publisherId = publisherId;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getPublisherAddress() {
		return publisherAddress;
	}
	public void setPublisherAddress(String publisherAddress) {
		this.publisherAddress = publisherAddress;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<String> getCountries() {
		return countries;
	}
	public void setCountries(List<String> countries) {
		this.countries = countries;
	}
	public Publisher(long publisherId, String publisherName, String publisherAddress, long phoneNumber,
			List<String> countries) {
		super();
		this.publisherId = publisherId;
		this.publisherName = publisherName;
		this.publisherAddress = publisherAddress;
		this.phoneNumber = phoneNumber;
		this.countries = countries;
	}
	public Publisher() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Publisher [publisherId=" + publisherId + ", publisherName=" + publisherName + ", publisherAddress="
				+ publisherAddress + ", phoneNumber=" + phoneNumber + ", countries=" + countries + "]";
	} 
	
	
}
