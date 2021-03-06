package com.model;

public class Item {

	private int height;
	private int width;
    private double surface;
    
    
	public double getSurface() {
		
		return this.height * this.width;
	}

	public void setSurface(double surface) {
		this.surface = surface;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public Item(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}

}
