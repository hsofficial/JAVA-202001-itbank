package ch03;

public class OperatorShiftExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=128;
		
		System.out.println("a의값: " + a);
		
		System.out.println("cal값: " +((a<<9)+(a<<1)+(a<<0)));// 2*2^8
		
		System.out.println("b의값: " + b);
		
		System.out.println("cal값: " +(b>>5));
	}

}
