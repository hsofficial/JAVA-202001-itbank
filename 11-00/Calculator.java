package ch11;

public abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int subtract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

//	public void showInfo() {
		// TODO Auto-generated method stub
//		System.out.println("<<<<<<calc interface>>>>>>>");
//	}
	
	
}
