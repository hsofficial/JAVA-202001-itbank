package ch08.inheritance.quiz;

public class SingleInheritance {
	public static void main(String[] args) {
//		Super spr = new Super();		
//		Sub1 sub1 = new Sub1();
		// �ڹٴ� ���� ��Ӹ� ���������� ���⼭ Sub1, Super �� ����� ��� ��� ���� ȿ��
		Sub2 sub2 = new Sub2();		// Sub2 �ڽ� Ŭ������ ��ü ����

		sub2.setCount(10);
		sub2.printCount();
		
//		sub2.num = 20;	// ��� ������ protected �����ڴ� publicó�� ��� ����
		sub2.setNum(20);
		sub2.printNum();
		
		sub2.setId(30);
//		sub2.id = 30;	// private ����, Ŭ���� �ܺο����� ���� �Ұ���(����)
		sub2.printId();
	}
}
