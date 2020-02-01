package ch04;

public class DoWhileExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int num = 0;
		
		do {
			num = num + i;
			System.out.println(i + " plus, current state of num : "+ num);
			i++;
		}while(i <= 10);
		System.out.println("after execute do while : " + num);
	}
}
