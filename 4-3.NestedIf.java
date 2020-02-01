package ch04;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int score;
		String grade;
		
		System.out.println("input score");
		score = input.nextInt();
		
		if(score >= 90) 
		{
			grade = "A";
			
			if(score >= 98) 
			{
				grade = grade + "+";
			}
			
			else if(score < 94) 
			{
				grade = grade + "-";
			}
			
		}
		
		else if(score >= 80) 
		{
			grade = "B";
			
			if(score >= 88) 
			{
				grade = grade + "+";
			}
			
			else if(score < 84) 
			{
				grade = grade + "-";
			}
			
		}
		
		else
		{
			grade = "C";
		}

		System.out.printf("grade: %s\n", grade);
	}

}
