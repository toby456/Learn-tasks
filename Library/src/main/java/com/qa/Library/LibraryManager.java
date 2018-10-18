package com.qa.Library;

import java.util.ArrayList;
import java.util.List;

public abstract class LibraryManager {

	private String libraryname;
	
	
	List<String> itemsCheckedIn = new ArrayList<>();
	

	
	
	
	public String checkOutItem() {

		return "Item is checked out";
	}
		
	public String returnItem() {
		return "Item has been returned";
	}
	
	public String addItem(Object itemName) {
		((Item) itemName).checkOut();
		return "Item has been added";
	}
	
	public String removeItem(Object itemName) {
		((Item) itemName).returnItem();
		return "Item has been removed";		
	}
	
	public String updateItem(Object item) {
		return "item has been updated";
	}


	public String getLibraryname() {
		return libraryname;
	}


	public void setLibraryname(String libraryname) {
		this.libraryname = libraryname;
	}

}
