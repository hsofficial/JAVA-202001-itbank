package ch04;

import java.util.Scanner;

public class ForGuGu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num, i, res;
		
		System.out.println("input num");
		num = input.nextInt();
		
		for(i=1 ; i <= 9 ; i++) {
			res = num * i;
			System.out.println(num + "x" + i +" = "+ res);
		}
		System.out.println("fin");
	}

}
