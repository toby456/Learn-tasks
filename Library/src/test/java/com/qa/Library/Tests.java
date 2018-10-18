package com.qa.Library;

import static org.junit.Assert.*;
import org.junit.Test;


public class Tests {
	
	@Test
	public void checkGettersAndSetters() {
		
		Item book1 = new Item();
		
		book1.setItemName("Good Omens");
		book1.setInStock("In Stock");
		
		assertEquals("Good Omens", book1.getItemName());
		assertEquals("In Stock", book1.getInStock());
		
		
		
	}
	
	

}
