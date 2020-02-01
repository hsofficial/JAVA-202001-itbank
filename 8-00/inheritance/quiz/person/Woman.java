package ch08.inheritance.quiz.person;

class Woman extends Person {	// Person 클래스 상속으로 만들어진 자식 클래스 Woman
	private int height;			// 키
	
	void setHeight(int height) {
		this.height = height;
	}
	
	int getHeight() {
		return height;
	}
}