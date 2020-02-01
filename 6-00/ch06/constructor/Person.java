package ch06.constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {
		System.out.println("<created person>");
	}
	
	public Person(String a_name) {
		name = a_name;
		System.out.println("name is : " + name);
	}
	
	public Person(String b_name, float b_height) {
		name = b_name;
		height = b_height;
		System.out.println("name is : " + name + ", height is : " + height);
	}
	
	public Person(String c_name, float c_height, float c_weight) {
		name = c_name;
		height = c_height;
		weight = c_weight;
		System.out.println("name is : " + name + ", height is : " + height+ ", weight is : " + weight);
	}
}
