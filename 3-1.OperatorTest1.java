package ch03;

import java.util.Scanner;
//ctrl + shift + o : auto-import in code

public class OperatorTest1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// 값을 입력 받기위한 객체생성
		
		int x, y;
		int sum = 0;
		double num1, num2;
		//sum for result > init
		
		System.out.print("int1: ");
		x = input.nextInt();
		// 정수를 입력받아 변수 x에 저장
		
		System.out.print("int2: ");
		y = input.nextInt();
		// 정수를 입력받아 변수 y에 저장
		
		sum = x + y;
		System.out.println("sum = "+ sum);
		
		System.out.println("");
		
		System.out.print("double1: ");
		num1 = input.nextDouble();
		
		System.out.print("double2: ");
		num2 = input.nextDouble();
	
		double sub = num1 - num2;
		System.out.println("sub = "+ sub);
		System.out.printf("sub = %.2f\n", sub);
		
		System.out.println("");
		/*
		System.out.println("name\n");
		String name = input.nextLine();
		
		System.out.println("subject");
		String subject = input.nextLine();
		
		System.out.println(name + "students, subject is" + subject);
		
		System.out.println("");
		*/
		System.out.print("kor: ");
		Double kor = input.nextDouble();
		
		System.out.print("eng: ");
		Double eng = input.nextDouble();
		
		System.out.print("mat: ");
		Double mat = input.nextDouble();
		
		Double scoresum = kor + eng + mat;
		Double scoreavg = scoresum / 3;
		
		System.out.printf("sum = %.2f\n", scoresum);
		System.out.printf("avg = %.2f\n", scoreavg);
	}
}
