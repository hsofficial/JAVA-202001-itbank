package ch04;

import java.util.Scanner;

public class DoWhileExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = 57, cnt = 0, guess;
		
		do {
			cnt++;
			System.out.println("input num");
			guess = new Scanner(System.in).nextInt();
			
			if(guess>ans) {
				System.out.println("bigger than ans");
			}
			else if(guess<ans) {
				System.out.println("smaller than ans");
			}
		}while(guess != ans);
		
		System.out.println("correct. cnt is "+cnt);
	}

}
