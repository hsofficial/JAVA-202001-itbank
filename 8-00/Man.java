package ch08;

public class Man extends Person{
	String sex;
	
	public Man(){
		sex = "male";
	}
	
	public Man(int no, int age) {
		super(no, age);
		sex = "male";
	}
	
	public String showManinfo() {
		return no+", "+age+"("+sex+")";
	}

	public String getSex() {
		return sex;
	}
	
}
