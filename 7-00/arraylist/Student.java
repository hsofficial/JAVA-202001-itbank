package ch07.arraylist;

import java.util.ArrayList;

public class Student {
	private int studentID;					// �й�
	private String studentName;				// �̸�
	private ArrayList<Subject> subjctList;	// ���� ����
	
	// �й��� �̸��� ���� �Ű� ���� ������
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.subjctList = new ArrayList<Subject>();// ���� ���� ����Ʈ ����
	}
	
	// ������ ArrayList�� �߰��ϴ� �޼���
	public void addSubject(String name, int score) {
//		Subject subject = new Subject();
//		subject.setSubjectName(name);
//		subject.setScorePoint(score);
		Subject subject = new Subject(name, score);
		
		subjctList.add(subject);
	}
	
	public void studentInfo() {
		int total = 0;
		
		for(Subject s : subjctList) {
			System.out.println(studentID + " ,"+studentName+ ">>>" + s.getSubjectName() + " : "+s.getScorePoint());
			total += s.getScorePoint();
		}
		
		System.out.println("total : "+total);
	}
	
	// ��ȯ�� �޼���
	public int getStudentID() {
		return studentID;
	}

	public String getStudentName() {
		return studentName;
	}
	
}
