package ch10;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Shape> slist = new ArrayList<Shape>();
		
		slist.add(new Rectangle());
		slist.add(new Circle());
		slist.add(new Triangle());
		slist.add(new Circle());
		
		for(int i = 0; i<slist.size(); i++) {
			Shape s = slist.get(i);
			s.draw();
		}
	}

}
