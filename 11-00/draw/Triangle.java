package ch11.draw;

public class Triangle implements Movable, Drawble{
	public void move(int x, int y) {
		System.out.println(x+" , "+y+" : move pointer");
	}
	
	@Override
	public void draw() {
		System.out.println("draw Triangle");
	}
}
