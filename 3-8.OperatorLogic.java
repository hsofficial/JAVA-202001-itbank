package ch03;

public class OperatorLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 7;
		char x = 'j';
		
		System.out.println(" i>3 && i<5의 결과: " + (i>3 && i<5));
		System.out.println(" i>3 || i<0의 결과: " + (i>3 || i<0));
		System.out.println( "(x>='a' && x<='z') || (x>='A' && x<='Z')의 결과");
		System.out.println(">>>" + ( (x>='a' && x<='z') || (x>='A' && x<='Z') ) );
		
		System.out.println("ascii about j = "+(int)'j');
		System.out.println("ascii about a = "+(int)'a');
		System.out.println("ascii about z = "+(int)'z');
		System.out.println("ascii about A = "+(int)'A');
		System.out.println("ascii about Z = "+(int)'Z');
	}

}
