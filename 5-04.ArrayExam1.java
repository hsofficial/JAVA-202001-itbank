package ch05;

import java.text.DecimalFormat;

public class ArrayExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		int sum  = 0;
		double avg = 0;
		int cnt = 0;
		
		arr = new int[] {100,90,80,70,60};
		
		for (int i : arr) {
			sum += i;
			cnt++;
		}
		
		avg = (double) (sum / cnt);
		
		System.out.println("sum is " + sum);
		System.out.printf("avg is %.2f\n", avg);
		
		DecimalFormat df = new DecimalFormat("0.00");
		// DecimalFormat("Expressive type");
		//0 : 유효값 아닌 경우 자리수만큼 0으로 채워서 형식표기
		//# : 유효값 있을 경우 숫자를 자리수만큼 표기하고 그렇지 아니하면 유효값만 표기
		
		System.out.println(df.format(avg));
	}

}
