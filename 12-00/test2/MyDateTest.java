package ch12.test2;

public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDate date1 = new MyDate(1993, 05, 16);
		MyDate date2 = new MyDate(1993, 05, 16);
		
		if(date1.equals(date2)) {
			System.out.println("same date");
		}
		System.out.println();
		
		System.out.println(date1.checksum);
		System.out.println(date1.checksum);
		System.out.println();
		System.out.println(date1.hashCode());
		System.out.println(date1.hashCode());

	}

}
