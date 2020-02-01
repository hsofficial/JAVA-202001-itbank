package ch04;

public class NestedWhileExam2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, j = 1, cal;
		while(++i < 10) {
			j = 0;
			while(++j < 10) {
				cal = i * j;
				System.out.println(i + " * " + j + " = "+ cal);
			}
			System.out.println("===============");
		}
	}

}
