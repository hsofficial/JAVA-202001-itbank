package ch04;

public class ForTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int num =0 ; num <=10 ; num ++) {
		sum += num;
		System.out.println("반복 내용 : " + num +", sum : "+ sum);
		}
		System.out.printf("반복문을 종료한 후 num : " + sum);
	}

}
