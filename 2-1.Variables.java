package ch02.var;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=20;
		
		//int i= 123.456;
		//double �ڷ����� int ������ ����
		
		float f = 123.456f;
		//���̻�fň ���̸� double �ڷ����� float �ڷ����� ��
		double d = 123.456;
		//���̻� d�� �����ϸ� double �ڷ������� �ν�
		double dd = 123.45d;
		//double �ڷ������� ���
		
		char ch1 = 'A';
		//char�� �� ���ڸ� ������ �ִ� Ÿ��
		char ch3 = '��';
		//2����Ʈ �ڷ��� ũ�� �ѱ� ����
		String str= "ABC def";
		//���ڿ� ��ü, �������� ���� ����
		//������ ����
		
		String str1 = new String("dlwlrma");
		
		final int MAX = 100;
		//final Ű���� ���� �������
		
		//MAX = 200
		// ����(����ǰ�������ȵ�)
		
		char a = '\u0041';
		//16���� �����ڵ�, �̽������� ����
		
		System.out.println(x +'\t' + f);
		System.out.println(f + '\n');
		System.out.println('\\');
		System.out.println('\'');
		System.out.println('\"');
		System.out.println(d);
		System.out.println(dd);
		System.out.println(ch1);
		System.out.println(ch3);
		System.out.println(str);
		System.out.println(str1);
		System.out.println(a);
	}

}
