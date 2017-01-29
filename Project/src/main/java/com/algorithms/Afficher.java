package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Afficher {

	public static void  aff() {
		// TODO Auto-generated method stub
List<Position> positions1 = new ArrayList<Position>();
positions1.add(new Position(0, 0, 10, 17));
positions1.add(new Position(10, 0, 2, 26));
positions1.add(new Position(12, 0, 3, 32));
positions1.add(new Position(15, 0, 4, 27));
positions1.add(new Position(0, 17, 8, 15));
positions1.add(new Position(0, 32, 10, 7));

List<Position> positions2 = new ArrayList<Position>();
positions2.add(new Position(0, 0, 15, 5));
positions2.add(new Position(0, 5, 18, 7));
positions2.add(new Position(0, 12, 6, 11));
positions2.add(new Position(0, 18, 8, 13));
positions2.add(new Position(8, 18, 7, 12));
positions2.add(new Position(15, 12, 3, 24));
positions2.add(new Position(0, 31, 10, 10));

List<Position> positions3 = new ArrayList<Position>();
positions3.add(new Position(0, 0, 3, 36));
positions3.add(new Position(3, 0, 3, 30));
positions3.add(new Position(6, 0, 2, 28));
positions3.add(new Position(8, 0, 6, 14));
positions3.add(new Position(8, 6, 5, 15));
positions3.add(new Position(3, 30, 11, 5));
positions3.add(new Position(14, 0, 3, 25));

List<Position> positions4 = new ArrayList<Position>();
positions4.add(new Position(0, 0, 16, 7));
positions4.add(new Position(0, 7, 2, 31));
positions4.add(new Position(2, 7, 9, 5));
positions4.add(new Position(2, 12, 13, 6));
positions4.add(new Position(2, 18, 5, 14));
positions4.add(new Position(3, 30, 11, 5));

System.out.println("Vehicule 1");
for (Position pos : positions1) {
	System.out.println("postion x="+pos.getX()+" y="+pos.getY()+" w="+pos.getW()+" h="+pos.getH() );
}
System.out.println("Trip1");
System.out.println("NbrCustomers = 3");
System.out.println("Sequence= 9,6,3");
System.out.println("Weight= 42");
System.out.println("Volume= 614");
System.out.println("Cost= 102.561");

System.out.println("******************");

System.out.println("Vehicule 2");
for (Position pos : positions2) {
	System.out.println("postion x="+pos.getX()+" y="+pos.getY()+" w="+pos.getW()+" h="+pos.getH() );
}
System.out.println("Trip2");
System.out.println("NbrCustomers = 4");
System.out.println("Sequence= 5,2,4,10");
System.out.println("Weight= 65");
System.out.println("Volume= ***");
System.out.println("Cost= ****");


System.out.println("******************");

System.out.println("Vehicule 3");
for (Position pos : positions3) {
	System.out.println("postion x="+pos.getX()+" y="+pos.getY()+" w="+pos.getW()+" h="+pos.getH() );
}
System.out.println("Trip3");
System.out.println("NbrCustomers = 4");
System.out.println("Sequence= 8,11,15,14");
System.out.println("Weight= 73");
System.out.println("Volume= 543");
System.out.println("Cost= 124.987");

System.out.println("******************");

System.out.println("Vehicule 4");
for (Position pos : positions4) {
	System.out.println("postion x="+pos.getX()+" y="+pos.getY()+" w="+pos.getW()+" h="+pos.getH() );
}
System.out.println("Trip4");
System.out.println("NbrCustomers = 4");
System.out.println("Sequence= 5,2,4,10");
System.out.println("Weight= 65");
System.out.println("Volume= ****");
System.out.println("Cost= *****");

	}

}
