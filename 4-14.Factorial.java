package ch04;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		long num, fact = 1, j;
		
		System.out.println("input num");
		num = input.nextInt();
		
		for(j=1; j<= num ; j ++) {
			fact = fact * j;
		}
		System.out.println(num+" factorial = "+fact);
	}

}
