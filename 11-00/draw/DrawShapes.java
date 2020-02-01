package ch11.draw;

import java.util.ArrayList;

public class DrawShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<DrawShapes> shapeList = new ArrayList<DrawShapes>();
		
		shapeList.add(new Triangle());
		shapeList.add(new Rectangle());
		shapeList.add(new Circle());
		
		for(Shape shape : shapeList) {
			if(shape instanceof Rectangle) {
				shape.move(4,8);
			} else if(shape instanceof Triangle) {
				shape.move(2,3);
			} else if(shape instanceof Circle) {
				shape.move(1,3);
			}else {
				System.out.println("err");
			}
			shape.draw();
		}
	}

}
