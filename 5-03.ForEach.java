package ch05;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score1;
		score1 = new int[] {100, 90, 80, 70, 60};
		
		int sum = 0;
		for(int i = 0; i<score1.length; i++) {
			sum += score1[i];
		}
		
		System.out.println("sum = " + sum);
		System.out.println("===================================");
		
		//enhanced for
		sum = 0;	//re-init
		
		for(int s : score1) {	
			//If there are values for an array, transfer data type value
			
			sum += s;	
			//Execute execution sentence reflection
		}
		System.out.println("Total of array elements : " + sum);
		System.out.println("===================================");
		
		char[] alp = new char[26];
		char ch = 'A';
		
		for(int i = 0; i<alp.length; i++, ch++) {
			alp[i] = ch;
		}
		
		for(int i = 0; i<alp.length; i++) {
			System.out.println(alp[i] + " , " + (int)alp[i]);
		}
		System.out.println("===================================");
		
		//enhanced for
		for(char a : alp) {
			System.out.println(a+" : "+(int)a);
		}
		System.out.println("===================================");
	}

}
