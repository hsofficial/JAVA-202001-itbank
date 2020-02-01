package ch04;

public class ForGuGu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, res;
		
		for(j = 2; j <= 9; j++) {
			
			for(i=1 ; i <= 9 ; i++) {
				res = j * i;
				System.out.println(j + "x" + i +" = "+ res);
			}
			
			System.out.println("============================");
		}
	}

}
