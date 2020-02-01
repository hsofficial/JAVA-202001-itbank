package ch03;

import java.util.Scanner;

public class Metropolis {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int population, richPopulation;
		
		System.out.println("input isCapitalcity(1 / 0)?");
		boolean isCapitalcity = (input.nextInt() == 1) ? true : false;
		
		System.out.println("input population");
		population = input.nextInt();
		
		System.out.println("input richPopulation");
		richPopulation = input.nextInt();
		
		String result = ( (isCapitalcity && population >= 100) || richPopulation >= 50 ) ? "TRUE" : "FALSE";
		System.out.println("isMetropolis? : " + result);
		
		
	}

}
