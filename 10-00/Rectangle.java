package ch10;

class Rectangle extends Shape{
	int width;
	int height;
	// 부모클래스의추상메서드는자식클래스에서반드시구현해야한다.
	// 추상메서드를구현하지않을시컴파일오류발생한다.
	@Override
	public void draw() {
	System.out.println("사각형그리기메서드");
	}
}
