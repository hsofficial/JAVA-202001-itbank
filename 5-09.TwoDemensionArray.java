package ch05;

import java.text.DecimalFormat;

public class TwoDemensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array1 = { {1,2,3}, {4,5,6}, {7,8,9}, {10,11,12} };
		int[][] array2 = new int[2][3];
		int[][]	array3 = new int[][] {{1,2},{3,4},{5,6}};
		
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array1[i].length; j++) {
				System.out.printf("%3d", array1[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println();
		
		for(int i = 0; i < array2.length; i++) {
			for(int j = 0; j < array2[i].length; j++) {
				System.out.printf("%02d", array2[i][j]);
			}
			System.out.println(" ");
		}
		
		System.out.println();
		DecimalFormat df2 = new DecimalFormat("00");
		
		for(int [] row : array3) {
			for(int col : row) {
				System.out.print(df2.format(col)+"\t");
			}
		System.out.println();
		}
	}

}
