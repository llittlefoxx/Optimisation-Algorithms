package com.algorithms;

import java.util.ArrayList;
import java.util.List;

import javax.tools.Tool;

import com.filereader.Tools;
import com.model.Item;
import com.model.ItemsPerNode;
import com.model.Vehicule;

public class Chargement {
	public static Vehicule vehicule;
	public static int veiW;
	public static int veiH;

	public static void charger(List<Vehicule> vehicules, List<ItemsPerNode> itemsPerNode) {

		vehicule = vehicules.get(0);
		veiH = vehicule.getHeight();
		veiW = vehicule.getWidth();

		int[][] matrix = new int[5][5];

		List<Position> positionsLibres = new ArrayList<Position>();
		Position pIni = new Position(0, 0, veiW, veiH);
		positionsLibres.add(pIni);

		Tools.displayMatrix(matrix);

		for (ItemsPerNode items : itemsPerNode) {
			List<Item> myItems = items.getItems();
			int nodeNumber = items.getNode().getNodeNumber();

			for (Item item : myItems) {

				
			}

		}
		System.out.println("\n----------------------------\n");
		Tools.displayMatrix(Tools.putInMatrix(matrix, pIni.getX(), pIni.getY(), 5, 3, 2));

		System.out.println("\n ****************** \n");
		Tools.testEmpty(matrix, 0, 0, 5, 5);
	}
}
