package ch08.inheritance.quiz;

class Manager extends Employee {
	String job;		// default ���� ����

	@Override
	protected void print() {	// ������
		super.print();	// �θ��� �޼��� ȣ��
		System.out.println(name + "����� " + job + "�Դϴ�.");	// ���� �߰�
	}
}