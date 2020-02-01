package ch08.inheritance.quiz.person;

class Person {
	private int no;		// �Ϸù�ȣ
	private int age;	// ����
	
	public void print() {
		System.out.println(getClass().getSimpleName() + " �Ϸù�ȣ : " + no);
		System.out.println(getClass().getSimpleName() + " ���� : " + age);
	}
	
	// Source -> Generate Getters and setters... fields ����, Access modifier ���� �� ����
	protected int getNo() {
		return no;
	}
	protected void setNo(int no) {
		this.no = no;
	}
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		this.age = age;
	}
}