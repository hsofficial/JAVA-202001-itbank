package ch06.reference.test;

public class Student {
	int studentID;
	String studentName;
	Subject korean;
	Subject math;
	
	public Student() {
		System.out.println("Student()");
	}
	
	public Student(int sID, String sName) {
		studentID = sID;
		studentName = sName;
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKorean(String name, int score) {
		korean.SubjectName = name;
		korean.scorePoint = score;
	}
	
	public void setMath(String name, int score) {
		math.SubjectName = name;
		math.scorePoint = score;
	}
	
	void showInfo() {
		System.out.println(studentID + " ," + studentName);
		System.out.println(korean.SubjectName + " : " + korean.scorePoint);
		System.out.println(math.SubjectName + " : " + math.scorePoint);
	}
}
