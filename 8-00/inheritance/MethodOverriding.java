package ch08.inheritance;

class Animal {
	public void sound() {
		System.out.println("으르렁~~");
	}
}

class Dog extends Animal {
	// 애노테이션 : 오버라이드를 컴파일러에 의해 정확하게 체크
	@Override
	public void sound() {	// 부모의 메서드 재정의
		System.out.println("멍멍!!");
	}
	// 구현 메서드가 없으면 부모의 메서드 호출	
}


public class MethodOverriding {	// 부모의 메서드와 이름, 리턴 타입, 매개변수의 타입과 개수가 일치해야만 함.
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.sound();
		
		Dog dog = new Dog();
		dog.sound();
	}
}
