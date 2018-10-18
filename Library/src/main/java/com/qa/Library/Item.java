package com.qa.Library;

public abstract class Item extends LibraryManager {

	private String itemName;
	private String inStock;
	
	
	public Item (String itemName, String inStock) {
		this.itemName = itemName;
		this.inStock = inStock;
	}
	

	public String checkOut() {

		return "Item is checked out";

	}

	public String returnItem() {
		return "Item has been returned";
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getInStock() {
		return inStock;
	}

	public void setInStock(String inStock) {
		this.inStock = inStock;

	}

}
