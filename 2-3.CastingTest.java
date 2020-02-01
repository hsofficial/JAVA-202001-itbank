package ch02.var;

public class CastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l = 12345L; 
		// int형 값을 long형 변수에 대입하면 자동 long형으로 변환
		int i = 35000;
		short s = 128;
		
		i = s;
		// int형 변수에 short형 변수를 대입하면 자동 int형으로 변환
		System.out.printf("s값: %d \n", s);
		
		//float f = 23.7;
		// 오류(float형 값 뒤에 'f'를 붙이지 않으면 double형으로 인식)
		
		float f = 23.7f;
		double d = 23.7;
		char c = 'A';
		// char형을 int로 형변환하면 'A'의 아스키코드 값으로 출력
		System.out.printf("%c -> %d \n", c, (int)c);
		
		int a = 100;
		String s1 = "JavaClass";
		System.out.printf("s1+a = %s \n", s1+a);
		// String+다른타입=String형으로 자동변환
		
		int b = 200;
		String s2 = "100";
		System.out.println("b+s2 = " + (b + Integer.parseInt(s2)));
		// 숫자300 출력
		
		String s3 = "3.14";
		System.out.println("a + s3 = "+ a + s3);
		System.out.println("a + s3 = "+ (a + Double.parseDouble(s3)));
	}

}
