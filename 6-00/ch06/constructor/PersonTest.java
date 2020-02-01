package ch06.constructor;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		
		person.name = "iu";
		System.out.println(person.name);
		//default constructor - auto-gen by compiler
		
		Person person2 = new Person("dlwlrma");
		//parameter constructor - created by programmer
		
		Person person3 = new Person("jieun", 161.7f);
		
		Person person4 = new Person("leejieun", 161.7f, 45f);
	}

}
