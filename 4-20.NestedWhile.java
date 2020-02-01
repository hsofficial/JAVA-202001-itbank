package ch04;

public class NestedWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, j = 0;
		while(i < 2) {
		System.out.println("out while " + i + " , " + j);
			while(j < 3) {
			System.out.println("in while " + i + " , " + j);
			j++;
			}
			i++;
			j = 0;
		}
		
	}

}
