package ch05;

public class ArrayExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum  = 0;
		double avg = 0;
		int cnt = 0;
		
		int[] arr = new int[5];
		arr = new int[] {83,65,78,96,54};
		
		for (int i : arr) {
			sum += i;
			cnt++;
		}
		
		avg = (double) sum / arr.length;
		
		for(int i=0; i<5; i++) {
			System.out.println("arr["+ i +"] : "+arr[i]);
		}
		System.out.println("============================");
		System.out.println("sum is " + sum);
		System.out.printf("avg is %.2f\n", avg);
	}

}
