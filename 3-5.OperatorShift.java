package ch03;

public class OperatorShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=12;
		System.out.println("a�ǰ�: " + a);
		System.out.println("a<<1�ǰ�: " + (a<<1));// 3*2^1
		System.out.println("a<<2�ǰ�: " + (a<<2));// 3*2^2
		System.out.println("a<<3�ǰ�: " + (a<<3));// 3*2^3
		System.out.println("b�ǰ�: " + b);
		System.out.println("b>>1�ǰ�: " + (b>>1));// 12/2^1
		System.out.println("b>>2�ǰ�: " + (b>>2));// 12/2^2
		System.out.println("b>>3�ǰ�: " + (b>>3));// 12/2^3
	}

}
