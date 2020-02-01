package ch06.classpart;

public class Student {
	//state
	int studentID;
	String studentName;
	int grade;
	String Address;
	
	//behavior
	void showInfo() {
		System.out.println("name : "+ studentID + ", address : "+ Address);
	}
}
