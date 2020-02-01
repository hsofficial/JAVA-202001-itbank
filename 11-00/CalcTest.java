package ch11;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 7;
		int num2 = 3;
		
		Calculator CompleteCalc = new CompleteCalc();
		
		System.out.println(CompleteCalc.add(num1, num2));
		System.out.println(CompleteCalc.subtract(num1, num2));
		System.out.println(CompleteCalc.times(num1, num2));
		System.out.println(CompleteCalc.divide(num1, 0));
		System.out.println(CompleteCalc.square(num2));

		
		System.out.println();
		
		Calculator calc2 = new CompleteCalc();
		
	}

}
