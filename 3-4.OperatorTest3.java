package ch03;

public class OperatorTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 = 10;
		byte b2 = 20;
		char c = 'A';
		int i = 10;
		float f = 3.14f;
		
		//byte b3 = b1+b2;// 오류
		int b3 = b1+b2;// 정상
		
		//byte b4 = (byte)b1+b2; // 오류
		byte b4 = (byte)(b1+b2); // 정상
		
		//char ci1 = c+i;// 오류
		char ci2 = (char)(c+i);// 정상
		int ci = (int)c+i;// 정상
		
		//intfi1 = f+i;// 오류
		int fi2 = (int)f+i; // 정상
		float fi= f+i;// 정상
		int fi1 = (int) (f+i);
		
		short s = 30;
		short sb2 = (short) (b2 + s);
		
		System.out.println("b1의 값 : " + b1);
		System.out.println("b2의 값 : " + b2);
		System.out.println("b3의 값 : " + b3);
		System.out.println("b4의 값 : " + b4);
		System.out.println("ci의 값 : " + ci);
		System.out.println("ci2의 값 : " + ci2);
		System.out.println("fi의 값 : " + fi);
		System.out.println("fi1의 값 : " + fi1);
		System.out.println("fi2의 값 : " + fi2);
		System.out.println("sb2의 값 : " + sb2);
		
	}

}
