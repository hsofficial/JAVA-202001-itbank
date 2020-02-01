package ch07.arraylist.quiz;

public class Dog {
	private String name;
	private String type;

	public Dog() {	// 기본 생성자
		this("이름 없음", "잡종");	// 생성자 내부에서 다른 생성자 호출 시 this 키워드 사용
	}
	
	public Dog(String name, String type) {	// 매개변수 생성자
		this.name = name;
		this.type = type;
	}
	
	public String showDogInfo() {	// 객체 정보 출력 메서드
		return name + ", " + type;	// 리턴 값 String
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
