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
		//0 : ��ȿ�� �ƴ� ��� �ڸ�����ŭ 0���� ä���� ����ǥ��
		//# : ��ȿ�� ���� ��� ���ڸ� �ڸ�����ŭ ǥ���ϰ� �׷��� �ƴ��ϸ� ��ȿ���� ǥ��
		
		System.out.println(df.format(avg));
	}

}
