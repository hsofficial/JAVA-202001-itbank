package ch11.draw;

public class Circle implements Movable, Drawble{
	public void move(int x, int y) {
		System.out.println(x+" , "+y+" : move pointer");
	}
	
	@Override
	public void draw() {
		System.out.println("draw Circle");
	}
}
