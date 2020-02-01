package ch06.classpart;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10, num2 = 20;
		
		int sum = add(num1, num2);		
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println("=====================================");
		
		int res1 = min(num1, num2);		
		System.out.println(num1 + " - " + num2 + " = " + res1);
		System.out.println("=====================================");
		
		int res2 = mul(num1, num2);		
		System.out.println(num1 + " * " + num2 + " = " + res2);
		System.out.println("=====================================");
		
		double res3 = div(num1, num2);		
		System.out.println(num1 + " / " + num2 + " = " + res3);
		System.out.println("=====================================");

	}

	public static int add(int num1, int num2) {

		int result = num1 + num2;
		return result;
	}
	
	public static int min(int num1, int num2) {
		
		int result = num1 - num2;
		return result;
	}
	
	public static int mul(int num1, int num2) {
	
		int result = num1 * num2;
		return result;
	}
	
	public static double div(double num1, double num2) {
		double result = num1 / num2;
		return result;
	}
}
