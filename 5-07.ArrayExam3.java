package ch05;

import java.text.DecimalFormat;

public class ArrayExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] subject = new String[5];
		int[] score = new int[5];
		int cnt = 0, checksum = 0;
		
		subject = new String[] { "국어", "영어", "수학", "과학", "코딩", "총점", "평균" };
		score = new int[] { 75, 89, 96, 86, 86, 0, 0 };
		
		checksum = subject.length;
		
		for (int i=0; i<=checksum - 3; i++) {
			score[checksum - 2] += score[i];
			cnt++;
		}
		
		score[checksum - 1] = score[checksum - 2] / cnt;
		
		//System.out.println("국어  영어  수학  총점  평균");
		for(int i=0; i<checksum; i++) {
			System.out.printf("%s  ",subject[i]);
		}
		System.out.printf("\n");
		
		for(int i=0; i<checksum; i++) {
			System.out.printf("======");
		}
		System.out.printf("\n");
		
		for(int i=0; i<checksum; i++) {
			System.out.printf("%d    ",score[i]); 
			
		}
		System.out.printf("\n");
		System.out.println();
		
		for(String s:subject)
			System.out.printf(s +"\t");
		
		System.out.println();
		
		for(int i:score)
			System.out.printf("--------");
		
		System.out.println();
		
		DecimalFormat df1 = new DecimalFormat("000");
		
		for(int i:score)
			System.out.printf(df1.format(i)+"\t");
		
	}

}
