package ch06.reference.test2;

public class Man {
	int old;
	String name;
	boolean marry;
	int childNum;
	
	public Man() {
		System.out.println(" ");
	}
	
	public Man(int age1, String name1) {
		
		old = age1;
		name = name1;
	}
	
	public void info() {
		System.out.println("old : " + old);
		System.out.println("name : " + name);
		System.out.println("merry? : " + marry);
		System.out.println("childnum : " + childNum);
		System.out.println("==========================");
	}
}
