package ch06.access;

public class Person {
	String name;
	int age;
	
	Person() {
		this("noname",1);
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person(String name){
		this.name = name;
	}
	
	Person returnSelf(){
		return this;
	}
	
	void print() {
		System.out.println(name + ", " + age);
	}
}
