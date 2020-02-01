package ch04;

import java.util.Scanner;

public class WhileExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		long in, i, num = 1;
		
		System.out.println("input num");
		in = input.nextInt();
		
		while(true) {
			i = in * num;
			System.out.println(in +" * "+ num +" = " + i);
			num++;
			
			if(num > 9)
				break;
		}
		
		
	}

}
