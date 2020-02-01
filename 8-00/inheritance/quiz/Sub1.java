package ch08.inheritance.quiz;

class Sub1 extends Super {	// 부모 클래스 Super를 상속한 Sub1 클래스
	protected int count;	// 상속 관계에서 접근 가능한 제어자
	
	public Sub1() {
//		super();	// 자동으로 컴파일러에 의해 추가
		System.out.println("Sub1 클래스 생성자() ");
	}
	// 모든 위치에서 메서드에 접근 가능한 제어자
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void printCount() {
		System.out.println("Sub1 클래스의 count값 : " + count);
	}
}