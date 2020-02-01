package ch07.arraylist;

import java.util.ArrayList;

public class Student {
	private int studentID;					// 학번
	private String studentName;				// 이름
	private ArrayList<Subject> subjctList;	// 수강 과목
	
	// 학번과 이름을 갖는 매개 변수 생성자
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.subjctList = new ArrayList<Subject>();// 수강 과목 리스트 생성
	}
	
	// 과목을 ArrayList에 추가하는 메서드
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
	
	// 반환자 메서드
	public int getStudentID() {
		return studentID;
	}

	public String getStudentName() {
		return studentName;
	}
	
}
