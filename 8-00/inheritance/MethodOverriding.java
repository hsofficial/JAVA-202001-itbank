package ch08.inheritance;

class Animal {
	public void sound() {
		System.out.println("������~~");
	}
}

class Dog extends Animal {
	// �ֳ����̼� : �������̵带 �����Ϸ��� ���� ��Ȯ�ϰ� üũ
	@Override
	public void sound() {	// �θ��� �޼��� ������
		System.out.println("�۸�!!");
	}
	// ���� �޼��尡 ������ �θ��� �޼��� ȣ��	
}


public class MethodOverriding {	// �θ��� �޼���� �̸�, ���� Ÿ��, �Ű������� Ÿ�԰� ������ ��ġ�ؾ߸� ��.
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.sound();
		
		Dog dog = new Dog();
		dog.sound();
	}
}
