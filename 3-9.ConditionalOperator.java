package ch03;

public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -10;
		int y = 62;
		int absX= x>=0 ? x : -x;
		char grade = y>=90 ? 'A' : y>=80 ? 'B' : 'C';
		System.out.println(" x의 절대값: " +absX);
		System.out.println(" y의 값: " +y);
		System.out.println(" grade의 값: " +grade);
		
		char grades = y>=90 ? 'A' : y>=80 ? 'B' :y>=70 ? 'C' :y>=60 ? 'D' : 'F';
		System.out.println(" grades의 값: " +grades);

	}
}
