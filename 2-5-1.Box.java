package ch02.var;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double w = 10.25;
		double h = 5.75;
		double area = w * h;
		double peri = 2 * (w + h);
		
		System.out.println("Output");
		System.out.println("�簢���� ���� : "+ w);
		System.out.println("�簢���� ���� : "+ h);
		System.out.println("");
		
		System.out.println("�簢���� ���� : "+ area);
		System.out.println("�簢���� ���� : "+ (int)area);
		System.out.printf("�簢���� ���� : %.0f\n\n", area);
		
		System.out.println("�簢���� �ѷ� : "+ peri);
		System.out.println("�簢���� �ѷ� : "+ (int)peri);
		System.out.printf("�簢���� �ѷ� : %.0f\n", peri);
	}

}
