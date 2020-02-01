package ch05;

import java.text.DecimalFormat;

public class ForEachTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr=
				{{110,100,110,120},//��������
				{120,110,100,120},//������
				{130,140,120,150}//����
				};
		
		int sum = 0;
		double avg = 0;
		
		DecimalFormat df = new DecimalFormat("000");
		DecimalFormat df2 = new DecimalFormat("#.##");
		
		System.out.println("���� 3�Ⱓ �б⺰ ������ �Ʒ��� ����,");
		
		for(int [] row : arr) {
			for(int col : row) {
				System.out.print(df.format(col)+", ");
				sum += col;
			}
		System.out.println();
		}
		avg = (double) sum / 3;
		
		System.out.printf("���� 3�Ⱓ ���� �Ѿ��� %d�̸�,\n",sum);
		System.out.println("����� " + df2.format(avg) + "�Դϴ�.");
	}

}
