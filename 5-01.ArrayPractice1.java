package ch05;

public class ArrayPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[5];
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		System.out.println("============================");
		
		score[0] = 100;
		score[1] = 90;
		score[2] = 80;
		score[3] = 70;
		score[4] = 60;

		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		System.out.println("============================");
		
		int[] score1 = {100,90,80,70,60};
		
		System.out.println(score1[0]);
		System.out.println(score1[1]);
		System.out.println(score1[2]);
		System.out.println(score1[3]);
		System.out.println(score1[4]);
		System.out.println("============================");
		
		// wrong >>> score1 = {100,90,80,70,60};
		
		for(int i=0; i<5; i++) {
			System.out.println("score1["+ i +"] : "+score1[i]);
		}
		System.out.println("============================");
		
		for(int i = 0; i<score1.length; i++) {
			System.out.println("score1["+ i +"] : "+score1[i]);
		}System.out.println("============================");
	}

}
