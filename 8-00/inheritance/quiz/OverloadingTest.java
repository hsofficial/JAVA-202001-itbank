package ch08.inheritance.quiz;
import java.text.DecimalFormat;

class Over {
	void method() {
		System.out.println("첫 번째 메서드 호출");
	}
	void method(int a, int b) {
		System.out.println("메서드 오버로딩1 호출");
	}
	void method(String a, int b) {
		System.out.println("메서드 오버로딩2 호출");
	}
	void method(int b, String a) {
		System.out.println("메서드 오버로딩3 호출");
	}
	void area(int r) {				// 원의 면적 메서드
		final double PI = Math.PI;	// 상수로 선언한 원주율
		DecimalFormat df = new DecimalFormat("0.0");		
		System.out.println("원의 넓이 : " + df.format(r*r*PI));
	}
	void area(int a, int b) {		// 사각형 면적 메서드
		System.out.println("사각형의 넓이 : " + a*b);
	}
}


public class OverloadingTest {
	public static void main(String[] args) {
		Over o = new Over();
		
		o.method();						// method()  호출
		o.method(1, 2);					// method(int a, int b) 호출
		o.method("Method", 3);			// method(String a, int b) 호출
		o.method(4, "Overloading");		// method(int b, String a) 호출
		
		o.area(5);						// area(int r)호출
		o.area(10, 20);					// area(int a, int b)호출
	}
}








