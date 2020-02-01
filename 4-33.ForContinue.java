package ch04;

import java.util.Scanner;

public class ForContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0, pluscnt = 0, num = 0;
		
		for(cnt = 0; cnt < 10; cnt++) {
			
			System.out.println("input num");
			num = new Scanner(System.in).nextInt();
			
			if(num>0)
				pluscnt++;
				continue;
		}
		System.out.println("plus cnt is : "+pluscnt);
	}

}
