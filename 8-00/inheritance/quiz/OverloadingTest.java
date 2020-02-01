package ch08.inheritance.quiz;
import java.text.DecimalFormat;

class Over {
	void method() {
		System.out.println("ù ��° �޼��� ȣ��");
	}
	void method(int a, int b) {
		System.out.println("�޼��� �����ε�1 ȣ��");
	}
	void method(String a, int b) {
		System.out.println("�޼��� �����ε�2 ȣ��");
	}
	void method(int b, String a) {
		System.out.println("�޼��� �����ε�3 ȣ��");
	}
	void area(int r) {				// ���� ���� �޼���
		final double PI = Math.PI;	// ����� ������ ������
		DecimalFormat df = new DecimalFormat("0.0");		
		System.out.println("���� ���� : " + df.format(r*r*PI));
	}
	void area(int a, int b) {		// �簢�� ���� �޼���
		System.out.println("�簢���� ���� : " + a*b);
	}
}


public class OverloadingTest {
	public static void main(String[] args) {
		Over o = new Over();
		
		o.method();						// method()  ȣ��
		o.method(1, 2);					// method(int a, int b) ȣ��
		o.method("Method", 3);			// method(String a, int b) ȣ��
		o.method(4, "Overloading");		// method(int b, String a) ȣ��
		
		o.area(5);						// area(int r)ȣ��
		o.area(10, 20);					// area(int a, int b)ȣ��
	}
}








