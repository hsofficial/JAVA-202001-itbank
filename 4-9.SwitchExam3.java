package ch04;

import java.util.Scanner;

public class SwitchExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String sc;
		int pay = 200;
		double bonus = 0;
		double salary = 0;
		
		System.out.println("input string(����/����/�븮/���)");
		sc = input.next();
		
		
		switch(sc) {
		case "����":
			salary = pay + (pay * 0.5);
			System.out.println("normal pay : 200����");
			System.out.println("bonus : 50%");
			System.out.println("salary : "+(int)salary +"����");
			break;
			
		case "����":
			salary = pay + (pay * 0.3);
			System.out.println("normal pay : 200����");
			System.out.println("bonus : 30%");
			System.out.println("salary : "+(int)salary +"����");
			break;
			
		case "�븮":
			salary = pay + (pay * 0.2);
			System.out.println("normal pay : 200����");
			System.out.println("bonus : 20%");
			System.out.println("salary : "+(int)salary +"����");
			break;
			
		case "���":
			salary = pay + (pay * 0.1);
			System.out.println("bonus : 10%");
			System.out.println("salary : "+(int)salary +"����");
			break;
			
		default:
			System.out.println("ERROR");
			}
	}

}
