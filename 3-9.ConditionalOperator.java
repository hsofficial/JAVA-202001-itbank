package ch03;

public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -10;
		int y = 62;
		int absX= x>=0 ? x : -x;
		char grade = y>=90 ? 'A' : y>=80 ? 'B' : 'C';
		System.out.println(" x�� ���밪: " +absX);
		System.out.println(" y�� ��: " +y);
		System.out.println(" grade�� ��: " +grade);
		
		char grades = y>=90 ? 'A' : y>=80 ? 'B' :y>=70 ? 'C' :y>=60 ? 'D' : 'F';
		System.out.println(" grades�� ��: " +grades);

	}
}
