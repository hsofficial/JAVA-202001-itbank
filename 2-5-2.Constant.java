package ch02.var;

public class Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rad = 5;
		final double PIPI = Math.PI;
		double area = PIPI * rad * rad;
		
		System.out.println("PI in System : "+ Math.PI);
		System.out.println("area of circle is : "+ area);
		System.out.printf("area of circle is : %.2f\n", area);
	}

}
