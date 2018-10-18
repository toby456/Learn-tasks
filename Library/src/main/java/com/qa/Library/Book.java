package com.qa.Library;

public class Book extends Item {
	
	private String iSBN;
	private String nameOfBook;
	
	public Book(String itemName, String inStock, String iSBN) {
		super(itemName, inStock);
		this.iSBN = iSBN;	
	}

	public String read() {
		return "The book is being read";
	}
	
	@Override
	public String checkOut() {
		return getNameOfBook() + " has been checked out";
	}
	
	@Override
	public String returnItem() {
		return getNameOfBook() + " has been returned";
	}
	
	
	public String getiSBN() {
		return iSBN;
	}

	public void setiSBN(String iSBN) {
		this.iSBN = iSBN;
	}

	public String getNameOfBook() {
		return nameOfBook;
	}

	public void setNameOfBook(String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}
	
	
	
	

}
