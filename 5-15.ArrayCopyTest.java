package ch05;

public class ArrayCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= { 1,2,3,4,5 };
		int[] newNum= new int[10];
		
		for(int i=0; i<num.length; i++) {
		newNum[i] = num[i]; 
		// 방법1: (대입연산자사용)
		
		System.out.println("num["+i+"]의값: " + num[i]);
		System.out.println("newNum["+i+"]의값: " + newNum[i]);
		}
		System.out.println("============================");
		
		System.out.println("newnum array");
		for (int i : newNum)
			System.out.print(i + " ");
		System.out.println("\n============================");
		System.out.println();
		
		int[] arr1 = { 6,7,8,9,10 };
		int[] arr2 = new int[5];
		
		
		System.arraycopy(arr1, 2, arr2, 1, 3); 
		// 방법2: (System.arraycopy사용)
		//System.arraycopy(src, srcPos, dest, destPos, length);
		
		for(int i=0; i<arr1.length; i++) {
		System.out.println("arr1[" + i+ "] : " + arr1[i]
		+ " , \t arr2[" + i+ "] : " + arr2[i] );
		}
		
		System.out.println("============================");
		
		System.arraycopy(arr1, 1, newNum, 6, 3);
		
		System.out.println("newnum array");
		for (int i : newNum)
			System.out.print(i + " ");
		System.out.println("\n============================");
		System.out.println();
		
	}
}
