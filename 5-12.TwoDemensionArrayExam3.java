package ch05;

import java.text.DecimalFormat;

public class TwoDemensionArrayExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[8][9];
		
		DecimalFormat df = new DecimalFormat(" 00");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf((i+2)+"´Ü : ");
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i+2) * (j+1);
				
				System.out.print(df.format(arr[i][j]));
				
				if(j == 8) {
					System.out.println("\n");
				}
			}
		}
		
	}

}
