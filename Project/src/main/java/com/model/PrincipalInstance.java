package com.model;

import java.util.List;

public class PrincipalInstance {

	private String instnaceName;

	private int vehiculNumber;
	private int numberOfCustomers;
	private int itemNumber;

	private Node origin;

	private List<Vehicule> vehiculs;
	private List<Node> nodes;
	private List<ItemsPerNode> itemspernode;

	public String getInstnaceName() {
		return instnaceName;
	}

	public void setInstnaceName(String instnaceName) {
		this.instnaceName = instnaceName;
	}

	public int getVehiculNumber() {
		return vehiculNumber;
	}

	public void setVehiculNumber(int vehiculNumber) {
		this.vehiculNumber = vehiculNumber;
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	public void setNumberOfCustomers(int numberOfCustomers) {
		this.numberOfCustomers = numberOfCustomers;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public Node getOrigin() {
		return origin;
	}

	public void setOrigin(Node origin) {
		this.origin = origin;
	}

	public List<Vehicule> getVehiculs() {
		return vehiculs;
	}

	public void setVehiculs(List<Vehicule> vehiculs) {
		this.vehiculs = vehiculs;
	}

	public List<Node> getNodes() {
		return nodes;
	}

	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}

	public List<ItemsPerNode> getItemspernode() {
		return itemspernode;
	}

	public void setItemspernode(List<ItemsPerNode> itemspernode) {
		this.itemspernode = itemspernode;
	}

}
