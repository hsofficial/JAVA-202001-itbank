package ch08.inheritance.quiz;

class Super {	// �ֻ��� �θ� Ŭ����
	protected int num;
	
	public Super() {
		System.out.println("Super Ŭ���� ������() ");
	}
	
	protected int getNum() {
		return num;
	}
	
	protected void setNum(int num) {
		this.num = num;
	}

	protected void printNum() {
		System.out.println("Super Ŭ������ num�� : " + num);
	}
}