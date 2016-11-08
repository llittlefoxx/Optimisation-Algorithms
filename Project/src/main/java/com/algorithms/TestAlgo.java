package com.algorithms;

public class TestAlgo {

	public static void main(String[] args) {
		
		
		//TestGraphic.createFrame(0, 0, 500, 500);
		
		
		// TODO Auto-generated method stub
		int[][] matrice=new int[5][6];
		
		int i, j;
		for(i=0; i<matrice.length; i++) {
			for(j=0; j<matrice[i].length; j++) {
				matrice[i][j]=1;
			}
		}
		
		for(i=0; i<matrice.length; i++) {
			for(j=0; j<matrice[i].length; j++) {
				System.out.format("%3d",matrice[i][j]);
			}
			 System.out.println();
		}
	}

}
