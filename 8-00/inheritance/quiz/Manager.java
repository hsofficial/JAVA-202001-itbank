package ch08.inheritance.quiz;

class Manager extends Employee {
	String job;		// default 접근 제어

	@Override
	protected void print() {	// 재정의
		super.print();	// 부모의 메서드 호출
		System.out.println(name + "담당은 " + job + "입니다.");	// 내용 추가
	}
}