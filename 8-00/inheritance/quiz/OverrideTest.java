package ch08.inheritance.quiz;

public class OverrideTest {
	public static void main(String[] args) {
		Manager managerKim = new Manager();
		managerKim.name = "James Kim";	// ��� ���� Ŭ���� ��� ����
		managerKim.setAge(30);
		managerKim.job = "������Ʈ �Ŵ���";	// ���� ��Ű�� Ŭ���� ��� ����
		managerKim.print();
		System.out.println();
		
		Manager managerLee = new Manager();
		managerLee.name = "Tomas Lee";
		managerLee.setAge(15);
		managerLee.job = "�̾�� ������";
		managerLee.print();
	}
}
