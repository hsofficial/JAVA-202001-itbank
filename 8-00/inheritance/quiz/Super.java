package ch08.inheritance.quiz;

class Super {	// 최상위 부모 클래스
	protected int num;
	
	public Super() {
		System.out.println("Super 클래스 생성자() ");
	}
	
	protected int getNum() {
		return num;
	}
	
	protected void setNum(int num) {
		this.num = num;
	}

	protected void printNum() {
		System.out.println("Super 클래스의 num값 : " + num);
	}
}