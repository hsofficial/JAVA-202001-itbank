package ch03;

import java.util.Scanner;

public class ConditionalOperatorQuiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int score;
		
		System.out.println("input your score : ");
		score = input.nextInt();
		
		String grade = score>=90 ? "수" : score>=80 ? "우" :score>=70 ? "미" :score>=60 ? "양" : "가";
		System.out.println(" grade의 값: " +grade);
	}

}
