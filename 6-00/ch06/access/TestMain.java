package ch06.access;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		
		test.print();
		System.out.println("===========================");
		
		test.setX(100);
		System.out.println(test.getX());
		
		test.setStr("dlwlrma");
		System.out.println(test.getStr());
		
		test.setY(5.16);
		System.out.println(test.getY());
		
		test.print();
	}

}
