package ch08.inheritance.quiz;

class Employee {
	protected String name;
	private int age;
	// ��� ���迡�� ��� ������ �޼���
	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected void print() {	// Object Ŭ���� �޼��� �������̵�
		System.out.println("����� �̸��� " + name + "�̰�, ���̴� " + age + "�Դϴ�.");
	}
}