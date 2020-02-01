package ch04;

import java.util.Scanner;

public class WhileBreakExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tot = 0, cnt = 0, num = 0;
		
		do {
			System.out.println("input num");
			num = new Scanner(System.in).nextInt();
			
			if(num <= 0)
				break;
			
			tot = tot + num;
			cnt++;
		}while(true);
		
		double avg = tot / cnt;
		
		System.out.printf("avg is : %.2f", avg);
	}

}
