package ch08.inheritance.quiz;

class Sub1 extends Super {	// �θ� Ŭ���� Super�� ����� Sub1 Ŭ����
	protected int count;	// ��� ���迡�� ���� ������ ������
	
	public Sub1() {
//		super();	// �ڵ����� �����Ϸ��� ���� �߰�
		System.out.println("Sub1 Ŭ���� ������() ");
	}
	// ��� ��ġ���� �޼��忡 ���� ������ ������
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void printCount() {
		System.out.println("Sub1 Ŭ������ count�� : " + count);
	}
}