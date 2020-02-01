package ch09.downcasting;

import java.util.ArrayList;

public class ShapeTest {
	
	
	public static void main(String[] args) {
		ArrayList<Shape> s = new ArrayList<Shape>();
		
		s.add(new Circle());
		s.add(new Triangle());
	
		for(Shape sh : s) {
			sh.draw();
		}
		
		System.out.println("==================================");
		
		for(int i = 0; i < s.size(); i++) {
			Shape sd = s.get(i);
			
			if(sd instanceof Circle) {
				Circle c = (Circle)sd;
				c.k_draw_c();
			}
			else if(sd instanceof Triangle) {
				Triangle t = (Triangle)sd;
				t.k_draw_t();
			}
			else {
				System.out.println("error");
			}
		}
	}
}