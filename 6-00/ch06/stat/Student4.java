package ch06.stat;

public class Student4 {
	private static int serialNumber = 1000;
	private static int cardNumber;
	private int studentID;
	private int studentcardID;
	public String studentName;
	
	public Student4() {
		serialNumber++;
		studentID = serialNumber;
		cardNumber = serialNumber + 100;
		studentcardID = cardNumber;
	}
	
	public static int getCardNumber() {
		return cardNumber;
	}
	public static void setCardNumber(int cardNumber) {
		Student4.cardNumber = cardNumber;
	}
	public static int getSerialNumber() {
		return serialNumber;
	}
	public static void setSerialNumber(int serialNumber) {
		Student4.serialNumber = serialNumber;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public int getStudentcardID() {
		return studentcardID;
	}
	public void setStudentcardID(int studentcardID) {
		this.studentcardID = studentcardID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
}
