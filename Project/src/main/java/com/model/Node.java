package com.model;

public class Node {

	private int nodeNumber;
	private double x;
	private double y;
	private double demand;

	public int getNodeNumber() {
		return nodeNumber;
	}

	public void setNodeNumber(int nodeNumber) {
		this.nodeNumber = nodeNumber;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getDemand() {
		return demand;
	}

	public void setDemand(double demand) {
		this.demand = demand;
	}

	public Node(int nodeNumber, double x, double y, double demand) {
		this.nodeNumber = nodeNumber;
		this.x = x;
		this.y = y;
		this.demand = demand;
	}

	public Node() {
	}
	  

}
