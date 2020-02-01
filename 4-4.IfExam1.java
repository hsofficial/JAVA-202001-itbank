package ch04;

import java.util.Scanner;

public class IfExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num;
		String result;
		
		System.out.println("input num");
		num = input.nextInt();
		
		if (num != 0) {
			if(num > 0) {
				result = "num is positive.";
			}
			else {
				result = "num is negative.";
			}
		}
		else {
			result = "num is zero.";
		}
		
		System.out.printf("result : %s\n", result);
	}

}
