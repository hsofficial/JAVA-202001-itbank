package ch08;

public class Woman extends Person{
	String sex;
	
	public Woman(){
		sex = "female";
	}
	
	public Woman(int no, int age) {
		super(no, age);
		sex = "female";
	}
	
	public String showWomaninfo() {
		return no+", "+age+"("+sex+")";
	}

	public String getSex() {
		return sex;
	}
	
}
