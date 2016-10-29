package com.filereader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.model.Item;
import com.model.ItemsPerNode;
import com.model.PrincipalInstance;

public class TestFileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		List<PrincipalInstance> test=new ArrayList<>();

		List<String> listeFichiers=new ArrayList<String>();
		listeFichiers=FileReader.getFiles();
		for (String string : listeFichiers) {
			test.add(FileReader.readFile(FileReader.fromStringToFile(string)));
			
		}
		System.out.println("nbr files "+listeFichiers.size());
		System.out.println("taille total"+test.size());
		for (PrincipalInstance pi : test) {
			System.out.println("principal Instance "+pi.getInstnaceName());
			for (ItemsPerNode ipn : pi.getItemspernode()) {
				System.out.println("--- > number item per node "+ipn.getNumberOfItems() +" total surface "+ipn.getTotalSurface());
				for (Item i : ipn.getItems()) {
					
					System.out.println(" *****> surface de "+i.getHeight() + " et "+i.getWidth() +" est "+i.getSurface());
				}
			}
		}
	}	

}
