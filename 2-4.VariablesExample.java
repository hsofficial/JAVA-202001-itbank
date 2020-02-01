package ch02.var;

public class VariablesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 930516;
		String name= "이지금";
		int kor = 100;
		int mat = 97;
		int eng = 99;
		double sum = kor + eng + mat;
		float avg = (float) (sum / 3);
		
		System.out.println("Output");
		System.out.println("학번 : "+ num);
		System.out.println("성명 : "+ name);
		System.out.println("국어 : "+ kor);
		System.out.println("영어 : "+ eng);
		System.out.println("수학 : "+ mat);
		System.out.println("합계 : "+ sum);
		System.out.println("평균 : "+ avg);
		
		System.out.printf("평균 by printf : %.1f ", avg);
	}

}
