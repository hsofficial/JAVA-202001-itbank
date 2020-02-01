package ch10;

abstract class Shape {
	int x;
	int y;
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void draw();
}
