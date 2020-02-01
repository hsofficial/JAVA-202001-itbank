package ch07.arraylist.quiz;

public class Dog {
	private String name;
	private String type;

	public Dog() {	// �⺻ ������
		this("�̸� ����", "����");	// ������ ���ο��� �ٸ� ������ ȣ�� �� this Ű���� ���
	}
	
	public Dog(String name, String type) {	// �Ű����� ������
		this.name = name;
		this.type = type;
	}
	
	public String showDogInfo() {	// ��ü ���� ��� �޼���
		return name + ", " + type;	// ���� �� String
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
