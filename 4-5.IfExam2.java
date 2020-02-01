package ch04;

import java.util.Scanner;

public class IfExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num;
		String result;
		
		System.out.println("input age");
		num = input.nextInt();
		
		if(num >= 15 && num <= 100)
			result = "positive.";
		else
			result = "negative.";
		
		//result = ( num >= 15 && num <= 100) ? "TRUE" : "FALSE";
		//result = ( num < 15 || num > 100) ? "FALSE" : "TRUE";
		
		System.out.printf("result : %s\n", result);

	}

}
