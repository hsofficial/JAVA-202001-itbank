package ch02.var;

public class CastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l = 12345L; 
		// int�� ���� long�� ������ �����ϸ� �ڵ� long������ ��ȯ
		int i = 35000;
		short s = 128;
		
		i = s;
		// int�� ������ short�� ������ �����ϸ� �ڵ� int������ ��ȯ
		System.out.printf("s��: %d \n", s);
		
		//float f = 23.7;
		// ����(float�� �� �ڿ� 'f'�� ������ ������ double������ �ν�)
		
		float f = 23.7f;
		double d = 23.7;
		char c = 'A';
		// char���� int�� ����ȯ�ϸ� 'A'�� �ƽ�Ű�ڵ� ������ ���
		System.out.printf("%c -> %d \n", c, (int)c);
		
		int a = 100;
		String s1 = "JavaClass";
		System.out.printf("s1+a = %s \n", s1+a);
		// String+�ٸ�Ÿ��=String������ �ڵ���ȯ
		
		int b = 200;
		String s2 = "100";
		System.out.println("b+s2 = " + (b + Integer.parseInt(s2)));
		// ����300 ���
		
		String s3 = "3.14";
		System.out.println("a + s3 = "+ a + s3);
		System.out.println("a + s3 = "+ (a + Double.parseDouble(s3)));
	}

}
