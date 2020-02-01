package ch04;

public class NestedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i , j;
		
		for(i=0; i < 2 ; i ++) {
		System.out.println("큰 반복문 외부 for");
			for(j=0; j< 3 ; j ++) {
				System.out.println(" 작은 반복문 내부 for");
			}
		System.out.println("==================");
		}
		System.out.println("------------------");
	}
}
