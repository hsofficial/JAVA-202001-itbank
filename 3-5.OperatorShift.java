package ch03;

public class OperatorShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=12;
		System.out.println("a의값: " + a);
		System.out.println("a<<1의값: " + (a<<1));// 3*2^1
		System.out.println("a<<2의값: " + (a<<2));// 3*2^2
		System.out.println("a<<3의값: " + (a<<3));// 3*2^3
		System.out.println("b의값: " + b);
		System.out.println("b>>1의값: " + (b>>1));// 12/2^1
		System.out.println("b>>2의값: " + (b>>2));// 12/2^2
		System.out.println("b>>3의값: " + (b>>3));// 12/2^3
	}

}
