package ch04;

public class NestedWhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2, j = 1, cal;
		while(i < 10) {
			while(j < 10) {
				cal = i * j;
				System.out.println(i + " * " + j + " = "+ cal);
				j++;
			}
			i++;
			j = 1;
			System.out.println("===============");
		}
	}

}
