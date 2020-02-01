package ch04;

public class DoWhileExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0, sum3 = 0, sum4 = 0;
		
		do {
			if(i%3==0||i%4==0) {
				sum += i;
				
				if(i%3==0)
					sum3 += i;
				
				else
					sum4 += i;
			}
			System.out.printf("current state in %d : sum = %d, sum3 = %d, sum4 = %d\n", i, sum, sum3, sum4);
			i++;
		}while(i <= 10);
		System.out.println("=========================================================");
		System.out.println("after execute do while : " + sum);
		System.out.println("about 3 : " + sum3);
		System.out.println("about 4 : " + sum4);
	}

}
