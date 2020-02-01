package ch13.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		
		try {
			for(int i=0;i<=5;i++) {
			System.out.println(array[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception : " + e);
		}
		System.out.println("end");
	}
}
