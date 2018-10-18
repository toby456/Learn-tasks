package com.qa.Library;

public class Person extends LibraryManager {
	
	private String name;
	private int age;
	private String itemsCheckedOut;
	
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
		 
	
	public String registerPerson(String name, int age) {
		setName(name);
		setAge(age);
		return getName() + " has been registered in the library system";
		
	}
	
	
	@Override
	public String addItem(Object itemName) {
		setItemsCheckedOut(getItemsCheckedOut() + ", " + itemName);
		((Item) itemName).returnItem();
		return itemName + " has been added to " + getName() + "'s account";	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getItemsCheckedOut() {
		return itemsCheckedOut;
	}

	public void setItemsCheckedOut(String itemsCheckedOut) {
		this.itemsCheckedOut = itemsCheckedOut;
	}
	
	
	

}
