package ch08.inheritance.quiz.person;

class Man extends Person { 	// Person 클래스 상속으로 만들어진 자식 클래스 Man
	private String gender;	// 성별

	// default 접근 제어 : 동일 패키지 내에서 접근 가능
	String getGender() {				// gender 접근자
		return gender;
	}

	void setGender(String gender) {		// gender 설정자
		this.gender = gender;
	}
}