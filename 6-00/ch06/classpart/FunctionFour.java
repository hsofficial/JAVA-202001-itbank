package ch06.classpart;

public class FunctionFour {
	//static method
	
	//return f parameter f
	static void func1() {
		String str = "Hello";
		System.out.println(str);
	}
	
	//return f parameter t
	static void func2(int x) {
		System.out.println("parameter is : " + x);
		return;
	}
	
	//return t parameter f
	static String func3() {
		String str = "java";
		return str;
	}
	
	//return t parameter t
	static String func4(String str1, String str2) {
		return str1 + str2;
	}
	
	public static void main(String[] args) {
		func1();
		func2(10);
		String res0 =  func3();
		System.out.println(res0);
		System.out.println(func4("dlwlrma", " iu"));
	}

}
