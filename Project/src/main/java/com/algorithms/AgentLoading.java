package com.algorithms;

import java.util.ArrayList;
import java.util.List;

import com.model.Item;
import com.model.ItemsPerNode;
import com.model.Node;
import com.model.Vehicule;

public class AgentLoading {

	public static Vehicule vehicule ;
	public static int veiW ;
	public static int veiH;
	public static void Load(List<Vehicule> vehicules, List<ItemsPerNode> itemsPerNode) {
	
		
		vehicule = vehicules.get(0);
		veiH = vehicule.getHeight();
		veiW = vehicule.getWidth();

		List<ItemsPerNode> ipnv=new ArrayList<>();
		vehicule.setItemsPerVehicul(ipnv);

		
		//with frame 
		TestGraphic.createFrame(0,0 , veiW*10, veiW*10,itemsPerNode);

		
		int[][] matrice = new int[veiH][veiW];

		// show empty car surface
		for (int[] i : matrice) {
			for (int j : i) {

				System.out.format("%5d", j);
			}
			System.out.println();
		}

		System.err.println("-----------------------------------------------------------------");
		
		
		for (ItemsPerNode i : itemsPerNode) {
			System.err.println("node number "+i.getNode().getNodeNumber());
		/*	if (i.getNode().getNodeNumber() !=0 && i.getTotalSurface() <= vehicule.getTotalSurface()
					&& i.getNode().getDemand() + vehicule.getCurrentCharge() <= vehicule.getCapacity()) {*/
				for (int k = 0; k < i.getNumberOfItems(); k++) {
					for (int j = 0; j < i.getItems().get(k).getWidth(); j++) {
						for (int z = 0; z < i.getItems().get(k).getHeight(); z++) {
                          matrice[z][j]=i.getNode().getNodeNumber()+(k*1000);
						}
					}
				/*}*/
			}
		}
		
		System.err.println("indice "+matrice[1][1]);
		// show empty car surface
		for (int[] i : matrice) {
			for (int j : i) {

				System.out.format("%5d", j);
			}
			System.out.println();
		}
		for (ItemsPerNode is : itemsPerNode) {
			System.out.println(is.getNode().getNodeNumber()+" tot sur "+is.getTotalSurface());
		}
	}
}
