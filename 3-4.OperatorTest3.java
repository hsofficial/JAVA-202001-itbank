package ch03;

public class OperatorTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 = 10;
		byte b2 = 20;
		char c = 'A';
		int i = 10;
		float f = 3.14f;
		
		//byte b3 = b1+b2;// ����
		int b3 = b1+b2;// ����
		
		//byte b4 = (byte)b1+b2; // ����
		byte b4 = (byte)(b1+b2); // ����
		
		//char ci1 = c+i;// ����
		char ci2 = (char)(c+i);// ����
		int ci = (int)c+i;// ����
		
		//intfi1 = f+i;// ����
		int fi2 = (int)f+i; // ����
		float fi= f+i;// ����
		int fi1 = (int) (f+i);
		
		short s = 30;
		short sb2 = (short) (b2 + s);
		
		System.out.println("b1�� �� : " + b1);
		System.out.println("b2�� �� : " + b2);
		System.out.println("b3�� �� : " + b3);
		System.out.println("b4�� �� : " + b4);
		System.out.println("ci�� �� : " + ci);
		System.out.println("ci2�� �� : " + ci2);
		System.out.println("fi�� �� : " + fi);
		System.out.println("fi1�� �� : " + fi1);
		System.out.println("fi2�� �� : " + fi2);
		System.out.println("sb2�� �� : " + sb2);
		
	}

}
