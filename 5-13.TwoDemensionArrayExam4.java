package ch05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TwoDemensionArrayExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("000 ");
		Scanner input = new Scanner(System.in);
		
		int ln=0, cnt = 1;
		
		System.out.printf("input ln : ");
		ln = input.nextInt();
		
		int[][] arr = new int[ln][ln];
		
		for(int i = 0; i < ln; i++) {
			for(int j = 0; j < ln; j++) {
				arr[i][j] = cnt;
				cnt++;
				
				System.out.print(df.format(arr[i][j]));
				}	
			System.out.println("\n");
		}	
	}

}
