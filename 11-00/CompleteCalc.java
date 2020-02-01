package ch11;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		if (num2 != 0)
			return num1 / num2;
		else
			return Calc.ERROR;
	}

	@Override
	public int square(int num1) {
		return num1 * num1;
	}

	@Override
	public void discription() {
		// TODO Auto-generated method stub
		super.discription();
		System.out.println("discription_comcalc");
	}

//	@Override
//	public void showInfo() {
//		System.out.println("<<<<<<complete_calc>>>>>>");
//	}
	
	
}
