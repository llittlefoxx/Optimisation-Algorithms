package com.filereader;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

import com.model.Item;
import com.model.ItemsPerNode;
import com.model.Node;
import com.model.Vehicule;

public class Tools {
	
	// this method tests if the weigh of all the items can be distributed on the
	// list of the available vehicules depending on their capacities
	//the method returns true if the cars can handle the charge and false if not

	public static boolean checkWeigh(List<Vehicule> vehicules, List<Node> nodes) {

		boolean res=true;
		double totalNodesWeigh=0;
		double totalVehiculsCharge=0;
		
		for (Node node : nodes) {
			totalNodesWeigh+=node.getDemand();
		}
		
		for (Vehicule  vehicul : vehicules) {
			totalVehiculsCharge+=vehicul.getCapacity();
		}
		
		if (totalNodesWeigh>totalVehiculsCharge) {
			res=false;
		}
		
		System.out.println("tot vehi -> "+totalVehiculsCharge);
		System.out.println("tot node -> "+totalNodesWeigh);
		
		if (res) {
			System.out.println("test vehicul capacity OK ");
		}
		else 
			System.err.println("test vehicul capacity NOT OK ");
		return res;
	}

	
	public static List<ItemsPerNode> sortnodes(List<ItemsPerNode> src){
		
		Collections.sort(src, new Comparator<ItemsPerNode>() {

			@Override
			public int compare(ItemsPerNode o1, ItemsPerNode o2) {
				
				if(o1.getTotalSurface()>o2.getTotalSurface()){
					return -1;
				}else{
					return 1;
				}
			}
			
		});
		
		List<ItemsPerNode> ipn=new ArrayList<>();
		for (ItemsPerNode itemsPerNode : src) {
			ipn.add(itemsPerNode);
		}
		return ipn;
	}
	
	// this method takes as parameter a string that contains numbers separated
	// by random spaces , extract them and returns a list of these numbers
	public static List<Integer> extractNumbers(String stringWithSpaces) {
		List<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < stringWithSpaces.length(); i++) {
			if (stringWithSpaces.charAt(i) == ' ') {

			} else {
				int start = i;
				int end = i;
				int number;
				while (stringWithSpaces.charAt(i) != ' ') {
					end++;
					i++;
				}
				number = Integer.valueOf(stringWithSpaces.substring(start, end));
				//System.out.println("extracted numbers " + number);
				output.add(number);

			}

		}
		return output;
	}
	
	// this method takes as parameter a string that contains numbers separated
	// by random spaces , extract them and returns a list of these doubles
	public static List<Double> extractDoubles(String stringWithSpaces) {
		List<Double> output = new ArrayList<Double>();
		for (int i = 0; i < stringWithSpaces.length(); i++) {
			if (stringWithSpaces.charAt(i) == ' ') {

			} else {
				int start = i;
				int end = i;
				double number;
				while (stringWithSpaces.charAt(i) != ' ') {
					end++;
					i++;
				}
				number = Double.valueOf(stringWithSpaces.substring(start, end));
				System.out.println("extracted doubles " + number);
				output.add(number);

			}

		}
		return output;
	}


}
