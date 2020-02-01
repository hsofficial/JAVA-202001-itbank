package ch04;

public class NamedLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				Loop1 : for(int i = 2; i <= 9; i++) {
					
					Loop2 : for(int j = 1; j <= 9; j++) {
					if (j==5)
						break Loop2;
					System.out.println(i + " * " + j + " = " + (i * j));
				}
	
				System.out.println("===========================");
			}
	
	}

}
