package com.filereader;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;

import com.algorithms.AgentLoading;
import com.algorithms.Position;
import com.model.Item;
import com.model.ItemsPerNode;

import javafx.geometry.Pos;

public class MyCanvas extends JComponent {

	Color[] colors = { Color.black, Color.blue, Color.cyan, Color.darkGray, Color.green, Color.lightGray, Color.magenta,
			Color.magenta, Color.orange, Color.pink, Color.red, Color.yellow, Color.black, Color.blue, Color.cyan,
			Color.darkGray, Color.green, Color.lightGray, Color.magenta, Color.magenta, Color.orange, Color.pink,
			Color.red, Color.yellow, Color.black, Color.blue, Color.cyan, Color.darkGray, Color.green, Color.lightGray,
			Color.magenta, Color.magenta, Color.orange, Color.pink, Color.red, Color.yellow, Color.black, Color.blue,
			Color.cyan, Color.darkGray, Color.green, Color.lightGray, Color.magenta, Color.magenta, Color.orange,
			Color.pink, Color.red, Color.yellow, Color.black, Color.blue, Color.cyan, Color.darkGray, Color.green,
			Color.lightGray, Color.magenta, Color.magenta, Color.orange, Color.pink, Color.red, Color.yellow,
			Color.black, Color.blue, Color.cyan, Color.darkGray, Color.green, Color.lightGray, Color.magenta,
			Color.magenta, Color.orange, Color.pink, Color.red, Color.yellow };

	public static int x = 0;
	public static int y = 0;
	public static int w;
	public static int h;
	public static Color color;
	List<ItemsPerNode> itemsPerNode = new ArrayList<ItemsPerNode>();
	List<Position> fullPositions = new ArrayList<>();
	List<Position> emptyPositions = new ArrayList<>();

	private int currentWload = 0;

	private int totalW;

	public MyCanvas(List<ItemsPerNode> itemsPerNode) {
		this.itemsPerNode = itemsPerNode;

	}

	/*
	 * public MyCanvas(int x, int y, int w, int h, Color color) { this.x = x;
	 * this.y = y; this.w = w; this.h = h; this.color = color; }
	 */
	public void paint(Graphics g) {

		Position InitialFreePosition=new Position(0, 0, AgentLoading.veiW*10, AgentLoading.veiH*10);
		emptyPositions.add(InitialFreePosition);
		for (int i = 0; i < itemsPerNode.size(); i++) {

			
			for (Item item : itemsPerNode.get(i).getItems()) {

				for (Position position : emptyPositions) {
					if(position.getW()>=item.getWidth() * 10 && position.getH()>=item.getHeight() *10 ){
						Graphics2D gr = (Graphics2D) g;
						gr.setColor(colors[i]);

						gr.drawString(itemsPerNode.get(i).getNode().getNodeNumber() + "",
								((item.getWidth() * 10 + item.getHeight() * 10) / 2) + x,
								(item.getWidth() * 10 + item.getHeight() * 10) / 2);

						gr.drawRect(x, y, item.getWidth() * 10, item.getHeight() * 10);
						Position fullposition = new Position(x, y, item.getHeight() * 10, item.getHeight() * 10);
						for (Position position2 : fullPositions) {
							totalW+=position2.getW();
						}
						Position freePosition1=new Position(x, y, i, i);
						fullPositions.add(fullposition);
						x += item.getWidth() * 10;
						System.err.println("current " + currentWload);
					}
				}
			

			}

		}
		for (Position pp : fullPositions) {
			System.out.println("full positions x " + pp.getX() + " y " + pp.getY() + " w " + pp.getW() + " H " + pp.getH());
		}

	}
}
