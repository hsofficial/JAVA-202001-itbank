package ch07.array.quiz;

public class Student {
	private static int serialNum = 1000;	// 학번을 자동으로 부여하기 위한 기준 변수 선언과 초기화
	private int studentID;
	private String name;
	
	public Student(String name) {	// 이름만 매개 변수로 갖는 생성자
		serialNum++;	// 학번 부여하는 serialNum 1증가
		this.studentID = serialNum;
		this.name = name;
	}
	
	public void showStudentInfo() {	// 학생 정보 출력
		System.out.println( studentID + ", " + name);
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
