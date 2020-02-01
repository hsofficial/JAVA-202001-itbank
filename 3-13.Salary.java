package ch03;

import java.util.Scanner;

public class Salary {

	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int salary;
		
		System.out.println("input salary");
		salary = input.nextInt();
		
		double save = (salary / 100) * 65;
		double cal = 10 * 12 * save;
		
		System.out.println(salary + " per month >>> Save 65 persent in 10 Years? : " + (int)cal);
	}

}
