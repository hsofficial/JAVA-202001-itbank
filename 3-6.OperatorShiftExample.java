package ch03;

public class OperatorShiftExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=128;
		
		System.out.println("a�ǰ�: " + a);
		
		System.out.println("cal��: " +((a<<9)+(a<<1)+(a<<0)));// 2*2^8
		
		System.out.println("b�ǰ�: " + b);
		
		System.out.println("cal��: " +(b>>5));
	}

}
