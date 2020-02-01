package ch03;

public class OperatorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10, num2 = 10;
		int a, b;
		
		a = ++num1;
		// 전위방식, 먼저 증가 후 연산
		System.out.println("a=" + a + ", num1=" + num1);
		// 11, 11
		
		b = num2++ ;
		// 후위방식, 먼저 연산 후 증가
		System.out.println("b=" + b + ", num2=" + num2);
		// 10, 11
	}

}
