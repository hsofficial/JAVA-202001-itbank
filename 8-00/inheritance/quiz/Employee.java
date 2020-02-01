package ch08.inheritance.quiz;

class Employee {
	protected String name;
	private int age;
	// 상속 관계에서 사용 가능한 메서드
	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected void print() {	// Object 클래스 메서드 오버라이딩
		System.out.println("사원의 이름은 " + name + "이고, 나이는 " + age + "입니다.");
	}
}