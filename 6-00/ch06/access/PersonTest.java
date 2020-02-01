package ch06.access;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person noname = new Person();
		
		noname.print();
		
		Person p = new Person();
		
		Person p2 = p.returnSelf();
		
		System.out.println(p);
		System.out.println(p2);
	}

}
