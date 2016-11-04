package com.filereader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import com.model.Item;
import com.model.ItemsPerNode;
import com.model.Node;
import com.model.PrincipalInstance;
import com.model.Vehicule;

public class FileReader {

	public static char[] charLine;

	public static PrincipalInstance readFile(File fin) throws IOException {
		FileInputStream fis = new FileInputStream(fin);
		System.out.println("file name : " + fin.getName());
		Scanner scanner = new Scanner(fis);
		String line = null;
		PrincipalInstance principalInstance = new PrincipalInstance();
		while (scanner.hasNextLine()) {
			
			List<ItemsPerNode> itemsPerNodePrincipal=new ArrayList<>();
			line = scanner.nextLine();
			if (line.startsWith("Instance:")) {

				// the instance name is placed at 10 charachters from the start
				// of the line
				principalInstance.setInstnaceName(line.substring(10));
				System.out.println("Instance name " + principalInstance.getInstnaceName());
				System.out.println(" line 1" + line);
				line = scanner.nextLine();
				line = scanner.nextLine();
				System.out.println(" line 2" + line);
				String x = line.trim();
				String custnumber = "";
				for (int i = 0; i < x.length(); i++) {
					if (x.charAt(i) == '-' && x.charAt(i + 1) == '-' && x.charAt(i + 2) == '-') {
						custnumber = x.substring(0, i);
						System.out.println("number of customers " + custnumber);
						principalInstance.setNumberOfCustomers(Integer.valueOf(custnumber.trim()));

					}
				}
				// this section reads the number of vehiculs from the file

				// to jump to the next line you should use .nextLine twice

				line = scanner.nextLine();

				System.out.println("------********** ena houni "+line);
				String newLineVehicul = line.trim();
				System.out.println("new line ->" + newLineVehicul);
				String vehinumber;

				for (int i = 0; i < newLineVehicul.length(); i++) {
					// this condition checks if there is a sequence of '---' to
					// access
					if (newLineVehicul.charAt(i) == '-' && newLineVehicul.charAt(i + 1) == '-'
							&& newLineVehicul.charAt(i + 2) == '-') {
						vehinumber = newLineVehicul.substring(0, i).trim();
						System.out.println("number of vehiculs " + vehinumber);
						principalInstance.setVehiculNumber(Integer.valueOf(vehinumber));

					}
				}
				// moving to the items line
				while (!line.endsWith("items")) {

					line = scanner.nextLine();
				}

				System.out.println("items line x ->" + line);

				String newLineItem = line.trim();
				String itemnumber;
				for (int i = 0; i < newLineItem.length(); i++) {
					System.out.println("inside");
					// this condition checks if there is a sequence of '---' to
					// access
					if (newLineItem.charAt(i) == '-' && newLineItem.charAt(i + 1) == '-'
							&& newLineItem.charAt(i + 2) == '-') {
						itemnumber = newLineItem.substring(0, i).trim();

						System.out.println("number of items " + itemnumber + "*");
						principalInstance.setItemNumber(Integer.valueOf(itemnumber));

						i = newLineItem.length();
					}
				}
				System.out.println("capacity line x ->" + line);
				while (!line.startsWith("Capacity ")) {
					line = scanner.nextLine();
				}
				line = scanner.nextLine();

			}

			System.out.println("capacity line ->" + line);
			int vehiculCapacity;
			int vehiculHeight;
			int vehiculWidth;

			// extracting nbers from Capacity - height - width of vehicles
			// line

			List<Integer> numbersInLine = new ArrayList<Integer>();

			numbersInLine = Tools.extractNumbers(line + " ");

			// numbers are in this order Capacity - height - width
			vehiculCapacity = numbersInLine.get(0);
			vehiculHeight = numbersInLine.get(1);
			vehiculWidth = numbersInLine.get(2);
			// list to be set to the principalinstace
			List<Vehicule> vehiculsList = new ArrayList<Vehicule>();

			// creation of the required number of vehiculs
			for (int j = 0; j < principalInstance.getVehiculNumber(); j++) {
				Vehicule vehicule = new Vehicule(vehiculCapacity, vehiculHeight, vehiculWidth);
				vehiculsList.add(vehicule);
			}

			principalInstance.setVehiculs(vehiculsList);
			System.out.println("vehi number " + principalInstance.getVehiculs().size());

			// reading Node - x - y - demand line
			while (!line.endsWith("demand")) {
				line = scanner.nextLine();

			}

			line = scanner.nextLine();

			List<Double> numbersInNodesList = new ArrayList<>();
			List<Node> nodeList = new ArrayList<Node>();
			while (!line.endsWith("for each item")) {
				System.out.println("line * ->" + line);
				// extracting Node - x - y - demandline
				numbersInNodesList = Tools.extractDoubles(line + " ");
				System.out.println("size " + numbersInNodesList.size());
				for (int i = 0; i < numbersInNodesList.size(); i++) {
					Node node = new Node(numbersInNodesList.get(i).intValue(), numbersInNodesList.get(i + 1),
							numbersInNodesList.get(i + 2), numbersInNodesList.get(i + 3));
					nodeList.add(node);
					i = i + 3;
				}
				line = scanner.nextLine();

			}

			principalInstance.setNodes(nodeList);
			System.out.println("number of all nodes " + nodeList.size());

			// reading items per node lines
			List<Integer> listOfItemsPerNode = new ArrayList<Integer>();
			while (scanner.hasNextLine()) {
				line = scanner.nextLine();
				System.out.println("line **-> " + line);
				listOfItemsPerNode = new ArrayList<Integer>();
				for (Integer integer : Tools.extractNumbers(line + " ")) {

					listOfItemsPerNode.add(integer);
				}
				int nodeNumber = listOfItemsPerNode.get(0);
				int itemsNumber = listOfItemsPerNode.get(1);
				Node selectedNode=new Node();
				List<Item> itemsList=new ArrayList<Item>();
				for (Node node : nodeList) {
					if (node.getNodeNumber()==nodeNumber) {
						selectedNode=node;
					}
				}
				
				System.out.println("node number " + nodeNumber);
				System.out.println("item number " + itemsNumber);
				if (itemsNumber != 0) {
					for (int i = 2; i < listOfItemsPerNode.size(); i = i + 2) {

						System.out.println("h " + listOfItemsPerNode.get(i) + " w " + listOfItemsPerNode.get(i + 1));

						Item item=new Item(listOfItemsPerNode.get(i), listOfItemsPerNode.get(i + 1));
						itemsList.add(item);
					}
					System.out.println("----------------");
				}else{
					System.out.println("ERROR");
					
				}

				ItemsPerNode itemsPerNode=new ItemsPerNode(selectedNode, itemsList, itemsNumber);
				itemsPerNodePrincipal.add(itemsPerNode);
				principalInstance.setItemspernode(itemsPerNodePrincipal);
				
			}
			
		}
		// closing the scanner
	
		scanner.close();
		return principalInstance;
		
	}
	

	public static List<String> getFiles() throws IOException {
		List<String> pathsAsString = new ArrayList<String>();
		try (Stream<Path> paths = Files.walk(Paths.get("G:/Hela/2l_cvrp-instances/2L_CVRP"))) {
			paths.forEach(filePath -> {
				if (Files.isRegularFile(filePath)) {
					pathsAsString.add(filePath.toString());
					System.out.println(filePath);
				}
			});
			return pathsAsString;
		}

	}

	public static File fromStringToFile(String pathAsString) {
		File file = new File(pathAsString);
		return file;
	}
}
