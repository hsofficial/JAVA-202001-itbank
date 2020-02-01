package ch05;

public class TwoDemensionArrayExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] arr = { {"BASIC"}, {"C"}, {"C++"}, {"C#"}, {"JAVA"} };
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println("=====================");
		
		for(String [] row : arr) {
			for(String col : row) {
				System.out.print(col);
			}
		System.out.println();
		}
		System.out.println("=====================");
	}

}
