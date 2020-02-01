package ch12.object;

public class CircleClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Circle circle = new Circle(10, 20, 5);
		Circle cloneCircle = (Circle)circle.clone();
		Circle circle2 = circle;
		
		System.out.println(circle);
		System.out.println(cloneCircle);
		System.out.println();
		
		System.out.println(circle.hashCode());
		System.out.println(circle2.hashCode());
		System.out.println(cloneCircle.hashCode());
		System.out.println();
		
	}

}
