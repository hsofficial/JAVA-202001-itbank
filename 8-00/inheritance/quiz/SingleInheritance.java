package ch08.inheritance.quiz;

public class SingleInheritance {
	public static void main(String[] args) {
//		Super spr = new Super();		
//		Sub1 sub1 = new Sub1();
		// 자바는 단일 상속만 가능하지만 여기서 Sub1, Super 두 멤버를 모두 상속 받은 효과
		Sub2 sub2 = new Sub2();		// Sub2 자식 클래스로 객체 생성

		sub2.setCount(10);
		sub2.printCount();
		
//		sub2.num = 20;	// 상속 관계의 protected 제어자는 public처럼 사용 가능
		sub2.setNum(20);
		sub2.printNum();
		
		sub2.setId(30);
//		sub2.id = 30;	// private 접근, 클래스 외부에서는 접근 불가능(오류)
		sub2.printId();
	}
}
