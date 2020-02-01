package ch08.inheritance.quiz.person;

class Person {
	private int no;		// 일련번호
	private int age;	// 나이
	
	public void print() {
		System.out.println(getClass().getSimpleName() + " 일련번호 : " + no);
		System.out.println(getClass().getSimpleName() + " 나이 : " + age);
	}
	
	// Source -> Generate Getters and setters... fields 선택, Access modifier 선택 후 생성
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