package ch06.stat;

public class Student2 {
	public static int serialNumber = 1000;
	private int studentID;
	public String studentName;
	
	public Student2() {
		serialNumber++;
		studentID = serialNumber;
	}
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
}
