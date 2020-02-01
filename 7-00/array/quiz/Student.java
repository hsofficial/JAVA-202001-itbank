package ch07.array.quiz;

public class Student {
	private static int serialNum = 1000;	// �й��� �ڵ����� �ο��ϱ� ���� ���� ���� ����� �ʱ�ȭ
	private int studentID;
	private String name;
	
	public Student(String name) {	// �̸��� �Ű� ������ ���� ������
		serialNum++;	// �й� �ο��ϴ� serialNum 1����
		this.studentID = serialNum;
		this.name = name;
	}
	
	public void showStudentInfo() {	// �л� ���� ���
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
