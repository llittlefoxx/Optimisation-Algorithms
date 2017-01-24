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
		int v=0;
		vehicule = vehicules.get(v);
		veiH = vehicule.getHeight();
		veiW = vehicule.getWidth();
		int max=0;

		int[][] matrix = new int[veiH][veiW];

		System.out.println("hedha rahou el heigh emta3 el karhba" + veiH);
		System.out.println("hedha rahou el widht emta3 el karhba" + veiW);

		 List<Position> positions = new ArrayList<Position>();
		// Position pIni = new Position(0, 0, veiW, veiH);
		// positionsLibres.add(pIni);
		int x = 0;
		int y = 0;
		 

		// Tools.displayMatrix(matrix);

		for (ItemsPerNode items : itemsPerNode) {
			List<Item> myItems = items.getItems();
			int nodeNumber = items.getNode().getNodeNumber();

			for (Item item : myItems) {
				
				
				boolean res = true;
				if (x >=veiW) {
					x=0;
					for (int p=0 ; p < positions.size();p++) {
						
						if(item.getWidth()<=positions.get(p).getW()){
							y=positions.get(p).getH();
							p=positions.size();
							
						}else{
							y=max;
						}
						
							if (y>=veiH){
								v++;
								vehicule=vehicules.get(v);
								x=0;
								y=0;
							}
						
					}
					
					
					System.out.println("ahaya el x " + x);
					System.out.println("aha el y " + y);
				}
			/*	for (int i = x; i < item.getHeight(); i++) {
					System.out.println("hedi men wosst el boucle x=" + x + " w bech enzide el hight " + item.getHeight()
							+ " w enzide el y=" + y);
					for (int j = y; j < item.getWidth(); j++) {
							System.out.println("namiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii  y="+y);
						

						if (matrix[i][j] == 0) {
							System.out.println(" hedhi el i  ," + i + "w hedi el j  " + j + "  " + matrix[i][j]);

						} else {
							System.out.println("aha rani fel esle ya 3am zebi  ");
							res = false;
							j=item.getWidth();
							System.out.println("el ka3na hedi i="+i+" j="+j+" em3abya eb "+matrix[i][j]);
						}

					}
					
					
					if (res){
						i=item.getHeight();
					}
				}*/
				if (res) {
					
					positions.add(new Position(x, y, item.getWidth(), item.getHeight()));
					if(max<item.getHeight()){
						max=item.getHeight();
					}
					
					
					for (int k = x; k < item.getHeight(); k++) {
						
						for (int s = y; s < item.getWidth(); s++) {
							matrix[k][s]=items.getNode().getNodeNumber();
						}
						}
					x=x+item.getWidth();
					
					//Tools.displayMatrix(matrix);
					
					
				/*	Tools.putInMatrix(matrix, x, y, items.getNode().getNodeNumber(), item.getWidth(), item.getHeight());
					System.out.println(
							"rani 3amaret el matrice eb " + items.getNode().getNodeNumber() + "men position x=" + x
									+ " wel y=" + y + " toulha " + item.getWidth() + " w 3ordhha " + item.getHeight());
*/
					//y = y + item.getWidth() + 1;
					System.out.println("ya sidi hani wssolt bech enbadel el y, y=" + y+" w hatit feha "+items.getNode().getNodeNumber());
				} else {
					System.out.println("ya3tek douda");
				}

			}

		}

		System.out.println("\n----------------------------\n");
		System.out.println("positio disponible ou nn ");
		System.out.println("\n----------------------------\n");

		//Tools.displayMatrix(matrix);
		
		System.out.println("\n ****************** \n");
		
		for (Position pos : positions) {
			System.out.println("postion x="+pos.getX()+" y="+pos.getY()+" w="+pos.getW()+" h="+pos.getH() );
		}
		System.out.println(" hedi el v "+ v);

	}
}
