package ch08.inheritance.quiz;

class Sub2 extends Sub1 {	// Sub1을 상속 받은 Sub2
	private int id;
	
	public Sub2() {
		System.out.println("Sub2 클래스 생성자() ");
	}
	// 디폴트 접근 제어자 : 동일 패키지 접근
	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	void printId() {
		System.out.println("Sub2 클래스의 id값 : " + id);	// 멤버 변수 출력
	}
}
