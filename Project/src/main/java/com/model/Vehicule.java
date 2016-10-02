package com.model;

public class Vehicule {

	private int capacity;
	private int height;
	private int width;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
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

	public Vehicule(int capacity, int height, int width) {
		this.capacity = capacity;
		this.height = height;
		this.width = width;
	}

}
