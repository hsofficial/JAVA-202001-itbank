package ch06.reference.test3;

public class Mall {
	long ordernum;
	String id;
	String date;
	String name;
	String lot;
	String address;
	
	public Mall() {
		
	}
	
	public Mall(String id1) {
		id1 = id;
	}

	void info() {
		System.out.println("**** order is created. ****");
		System.out.println("order number : " + ordernum);
		System.out.println("user ID : " + id);
		System.out.println("order date : " + date);
		System.out.println("user name : " + name);
		System.out.println("LOT Num : " + lot);
		System.out.println("address : " + address);
		System.out.println("================================");
	}
}
