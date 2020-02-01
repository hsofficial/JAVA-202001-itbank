package ch08;

class Mother {
	private String name;
	
	Mother(String name){
		this.name = name;
	}

	void display() {
		// TODO Auto-generated method stub
	}
}

class Son extends Mother{
	private String name;
	
	Son(String mothername, String myname){
		super(mothername);
		this.name = myname;
	}
	
	@Override
	void display() {
		super.display();
		System.out.println("son name : " + this.name);
	}
}

public class SuperTest{
	public static void main(String[] args) {
		Son son = new Son("dlwlrma", "iu");
		son.display();
	}
}
