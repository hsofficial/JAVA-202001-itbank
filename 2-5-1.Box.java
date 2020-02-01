package ch02.var;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double w = 10.25;
		double h = 5.75;
		double area = w * h;
		double peri = 2 * (w + h);
		
		System.out.println("Output");
		System.out.println("사각형의 가로 : "+ w);
		System.out.println("사각형의 세로 : "+ h);
		System.out.println("");
		
		System.out.println("사각형의 면적 : "+ area);
		System.out.println("사각형의 면적 : "+ (int)area);
		System.out.printf("사각형의 면적 : %.0f\n\n", area);
		
		System.out.println("사각형의 둘레 : "+ peri);
		System.out.println("사각형의 둘레 : "+ (int)peri);
		System.out.printf("사각형의 둘레 : %.0f\n", peri);
	}

}
