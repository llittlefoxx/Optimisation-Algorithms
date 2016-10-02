package com.filereader;

import java.util.ArrayList;
import java.util.List;

public class Tools {
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
