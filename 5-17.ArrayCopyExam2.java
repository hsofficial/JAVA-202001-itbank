package ch05;

public class ArrayCopyExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1 , 2 , 3 , 4 , 5 };
		int[] arr2 = { 6 , 7 , 8 , 9 , 10, 11};
		int[] dest= new int[(arr1.length + arr2.length)];
		
		System.arraycopy(arr1, 0, dest, 0, arr1.length);
		System.arraycopy(arr2, 0, dest, arr1.length, arr2.length);
		
		for (int i : dest) {
			System.out.printf("%d ", i);	
		}
	}

}
