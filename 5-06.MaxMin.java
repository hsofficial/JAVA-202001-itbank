package ch05;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		
		int max = arr[0]; //최대값
		int min = arr[0]; //최소값
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("input num" + i);
			arr[i] = new Scanner(System.in).nextInt();
			
			System.out.println("arr["+ i +"] : "+arr[i]);
			System.out.println("------------------------");
			
			if(max<arr[i]) {
				max = arr[i];
			    }
						
			    if(min>arr[i]) {
				min = arr[i];
			    }

		}
		
		System.out.println("max : "+ max);
		System.out.println("min : "+ min);
	}

}
