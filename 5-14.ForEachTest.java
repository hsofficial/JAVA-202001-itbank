package ch05;

import java.text.DecimalFormat;

public class ForEachTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr=
				{{110,100,110,120},//지지난해
				{120,110,100,120},//지난해
				{130,140,120,150}//올해
				};
		
		int sum = 0;
		double avg = 0;
		
		DecimalFormat df = new DecimalFormat("000");
		DecimalFormat df2 = new DecimalFormat("#.##");
		
		System.out.println("지난 3년간 분기별 매출은 아래와 같고,");
		
		for(int [] row : arr) {
			for(int col : row) {
				System.out.print(df.format(col)+", ");
				sum += col;
			}
		System.out.println();
		}
		avg = (double) sum / 3;
		
		System.out.printf("지난 3년간 매출 총액은 %d이며,\n",sum);
		System.out.println("연평균 " + df2.format(avg) + "입니다.");
	}

}
