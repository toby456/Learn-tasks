package com.qa.PaintWizard;

import java.util.ArrayList;
import java.util.List;

public class Paint {

	private double ppl; // price per litre
	private int areaOfPaint; // the size of the wall that can be painted
	private int size;
	private double price;
	private int ppr; // paint per room
	private String name;
	private int wastage;

	public Paint(String name, int areaOfPaint, int size, double price) {
		this.areaOfPaint = areaOfPaint;
		this.size = size;
		this.price = price;
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	public void calculateWastage(Room nameofroom) {
		this.wastage = (this.getAreaOfPaint() * this.getSize()) - nameofroom.getSizeOfRoom();

	}
	
	public void bestValue(Room nameofroom) {
		this.ppl = (this.getPrice() / this.getSize());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public double getPpl() {
		return ppl;
	}

	public void setPpl(double ppl) {
		this.ppl = ppl;
	}

	public String getName() {
		return name;
	}

	public int getWastage() {
		return wastage;
	}

	public void setWastage(int wastage) {
		this.wastage = wastage;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPpr() {
		return ppr;
	}

	public void setPpr(int ppr) {
		this.ppr = ppr;
	}

	public int getAreaOfPaint() {
		return areaOfPaint;
	}

	public void setAreaOfPaint(int areaOfPaint) {
		this.areaOfPaint = areaOfPaint;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
