package ch11.interfaceex;

public class MyClass implements MyInterface{
//	MyInterface mi = new MyInterface(); XXX
//	public static void main(String[] args) {
//		
//	}

	@Override
	public void y() {
		// TODO Auto-generated method stub
		System.out.println("y");
	}

	@Override
	public void x() {
		// TODO Auto-generated method stub
		System.out.println("x");
	}

	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
		System.out.println("mymethod");
	}
}
