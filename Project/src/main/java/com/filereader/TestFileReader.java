package com.filereader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestFileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		List<String> listeFichiers=new ArrayList<String>();
		listeFichiers=FileReader.getFiles();
		for (String string : listeFichiers) {
			FileReader.readFile(FileReader.fromStringToFile(string));
			
		}
	}	

}
