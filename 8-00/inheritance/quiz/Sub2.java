package ch08.inheritance.quiz;

class Sub2 extends Sub1 {	// Sub1�� ��� ���� Sub2
	private int id;
	
	public Sub2() {
		System.out.println("Sub2 Ŭ���� ������() ");
	}
	// ����Ʈ ���� ������ : ���� ��Ű�� ����
	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	void printId() {
		System.out.println("Sub2 Ŭ������ id�� : " + id);	// ��� ���� ���
	}
}
