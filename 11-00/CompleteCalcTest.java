package ch11;

public class CompleteCalcTest {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		int sum = Calc.total(array);
		System.out.println("sum of arr : "+sum);
		System.out.println();
		
		CompleteCalc completecalc = new CompleteCalc();
		completecalc.discription();
	}
}
