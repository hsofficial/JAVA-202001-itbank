package ch04;

public class WhileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum = sum + num;
			System.out.println("num : "+ num +" , sum = "+sum);
			num++;
		}
		System.out.println("반복문을 종료한 후 : "+ sum );
	}

}
