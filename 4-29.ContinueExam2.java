package ch04;

public class ContinueExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		
		for(int i=0;i<=100;i++) {
			
			sum = sum + i;
			
			if(i % 5 == 0 || i % 7 == 0)
				sum = sum - i;
				continue;
			
			
		}
		System.out.println(sum);
	}

}
