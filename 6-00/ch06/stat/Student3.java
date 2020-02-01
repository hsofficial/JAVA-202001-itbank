package ch06.stat;

public class Student3 {
	private static int serialNumber = 1000;
	private int studentID;
	public String studentName;
	
	public Student3() {
		serialNumber++;
		studentID = serialNumber;
	}
	
	
	public static int getSerialNumber() {
		return serialNumber;
	}
	public static void setSerialNumber(int serialNumber) {
		Student3.serialNumber = serialNumber;
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
