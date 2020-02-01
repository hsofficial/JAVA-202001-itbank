package ch03;

import java.util.Scanner;

public class ConditionalOperatorQuiz2 {

	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int year;
		
		System.out.println("input year");
		year = input.nextInt();
		
		String result = ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ) ? "TRUE" : "FALSE";
		System.out.println(year + " >>> isLeapYear? : " + result);
	}

}
