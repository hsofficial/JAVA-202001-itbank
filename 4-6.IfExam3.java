package ch04;

import java.util.Scanner;

public class IfExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int speed, design, mileage;
		String result;
		
		System.out.println("input speed");
		speed = input.nextInt();
		System.out.println("input design");
		design = input.nextInt();
		System.out.println("input mileage");
		mileage = input.nextInt();
		
		double avg = (speed + design + mileage) / 3;
		
		if(speed >= 80 && design>=80 && mileage >= 80) {
			result = "best";

			if(avg >= 80) 
			{
				result = result + " and Approved";
			}
			
			else if(avg < 80 && avg >= 70) 
			{
				result = result + " and Normal";
			}
			
			else
			{
				result = result + " and Recall";
			}
			
		}
		
		else {
			result = "";
			
			if(avg >= 80) 
			{
				result = result + "Approved";
			}
			
			else if(avg < 80 && avg >= 70) 
			{
				result = result + "Normal";
			}
			
			else
			{
				result = result + "Recall";
			}
		}
		
		System.out.printf("result : %s\n", result);
		System.out.printf("avg : %.1f", avg);
	}
		

}
