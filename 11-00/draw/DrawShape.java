package ch11.draw;

public class DrawShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Circle c = new Circle();
		
		r.move(1, 2);
		r.draw();
		t.move(3, 4);
		t.draw();
		c.move(5, 6);
		c.draw();
	}

}
