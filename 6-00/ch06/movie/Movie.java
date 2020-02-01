package ch06.movie;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Movie {
	String title = "tit";
	String name = "name";
	long year = 2020;
	double score = 100;
	
	void print() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("fun score : ");
		int s1 = sc.nextInt();
		
		System.out.printf("work score : ");
		int s2 = sc.nextInt();
		
		System.out.printf("art score : ");
		int s3 = sc.nextInt();
		
		DecimalFormat df = new DecimalFormat("0.#");
		
		score = (double) (s1 + s2 + s3)/3;
		
		System.out.println("==============================");
		System.out.println(title + ", director : " + name + " (" + year +")");
		System.out.println("score : " + df.format(score));
		
		
		
	}
}
