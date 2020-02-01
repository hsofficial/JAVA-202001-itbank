package ch05;

public class TwoDemensionArrayExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][]arr = new char[][]{{'A','B','C'},{'D','E','F'}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println(" ");
		}
		
		System.out.println();
		
		for(char [] row : arr) {
			for(char col : row) {
				System.out.print(col);
			}
		System.out.println();
		}
		
		System.out.println("=========================");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		for(char[] row : arr) {
			System.out.println(row);
		}
	}

}
