package ch02.var;

public class VariablesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 930516;
		String name= "������";
		int kor = 100;
		int mat = 97;
		int eng = 99;
		double sum = kor + eng + mat;
		float avg = (float) (sum / 3);
		
		System.out.println("Output");
		System.out.println("�й� : "+ num);
		System.out.println("���� : "+ name);
		System.out.println("���� : "+ kor);
		System.out.println("���� : "+ eng);
		System.out.println("���� : "+ mat);
		System.out.println("�հ� : "+ sum);
		System.out.println("��� : "+ avg);
		
		System.out.printf("��� by printf : %.1f ", avg);
	}

}
