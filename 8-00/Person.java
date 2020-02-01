package ch08;

public class Person {
	protected int no;
	protected int age;
	
	public Person() {
	}
	
	public Person(int no, int age) {
		this.no = no;
		this.age = age;
	}
	
	public String showinfo() {
		return no+", "+age;
	}

	public int getNo() {
		return no;
	}
	public int getAge() {
		return age;
	}
	
}
