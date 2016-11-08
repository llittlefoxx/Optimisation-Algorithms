package com.model;

import java.util.ArrayList;
import java.util.List;

public class ItemsPerNode {

	private Node node;
	private List<Item> items = new ArrayList<Item>();
	private int numberOfItems;
	private double totalSurface;
	

	public double getTotalSurface() {
		double total=0;
		for (Item item : items) {
			total=total+item.getSurface();
		}
		return total;
	}

	public void setTotalSurface(double totalSurface) {
		this.totalSurface = totalSurface;
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public ItemsPerNode(Node node, List<Item> items, int numberOfItems) {
		this.node = node;
		this.items = items;
		this.numberOfItems = numberOfItems;
	}

	public ItemsPerNode() {
		// TODO Auto-generated constructor stub
	}

}
