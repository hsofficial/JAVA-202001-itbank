package ch03;

public class OperatorCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("'A'<'B'�ǰ��: " + ('A'<'B'));
		System.out.println("'0'==0�ǰ��: " + ('0'==0));
		System.out.println("'A'!=65�ǰ��: " + ('A'!=65));
		System.out.println("10.0d==10.0f�ǰ��: " + (10.0d==10.0f));
		
		System.out.printf("0.1d = %.16f\n", 0.1d);
		System.out.printf("0.1f = %.16f\n", 0.1f);
		
		System.out.println("0.1d==0.1f�ǰ��: " + (0.1d==0.1f));
		
		System.out.println("(float)0.1d==0.1f�ǰ��: " + ((float)0.1d==0.1f));
		
		System.out.println("ascii about A = "+(int)'A');
		System.out.println("ascii about B = "+(int)'B');
	}

}
