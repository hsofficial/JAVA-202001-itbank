package ch05;

public class RandomLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("random lotto num maker");
		System.out.println("=========================");
		int[] arr = new int[7];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 45) + 1;
			
			for(int j = 0; j <= i - 1; j++) {
				
				while(arr[i] == arr[j])
					arr[j] = (int)(Math.random() * 45) + 1;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf(arr[i] + " ");
		}
	}

}
