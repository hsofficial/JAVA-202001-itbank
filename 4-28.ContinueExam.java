package ch04;

public class ContinueExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		for(int i=0;i<=10;i++) {
			
			sum = sum + i;
			
			if(i==5)
				sum = sum - 5;
				continue;
			
			
		}
		System.out.println(sum);
	}

}
