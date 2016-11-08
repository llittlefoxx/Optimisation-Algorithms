package com.model;

import java.util.List;

public class Vehicule {

	private int capacity;
	private int height;
	private int width;
    private int totalSurface;

    private List<ItemsPerNode> itemsPerVehicul;
    private int currentCharge;
    
    
    

	public List<ItemsPerNode> getItemsPerVehicul() {
		return itemsPerVehicul;
	}

	public void setItemsPerVehicul(List<ItemsPerNode> itemsPerVehicul) {
		this.itemsPerVehicul = itemsPerVehicul;
	}

	public int getCurrentCharge() {
		int ch=0;
		for (ItemsPerNode itemsPerNode : itemsPerVehicul) {
			ch+=itemsPerNode.getNode().getDemand();
		}
		return ch;
	}

	public void setCurrentCharge(int currentCharge) {
		this.currentCharge = currentCharge;
	}

	public int getTotalSurface() {
		return width*height;
	}

	public void setTotalSurface(int totalSurface) {
		this.totalSurface = totalSurface;
	}

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
