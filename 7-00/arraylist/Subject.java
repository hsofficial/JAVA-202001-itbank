package ch07.arraylist;

public class Subject {
	private String subjectName;	// 과목명
	private int scorePoint;		// 점수
	
	public Subject() {
		this("과목명", 0);
	}
	
	public Subject(String subjectName, int scorePoint) {	// 매개 변수 생성자
		this.subjectName = subjectName;
		this.scorePoint = scorePoint;
	}

	// 접근자/ 설정자 메서드
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getScorePoint() {
		return scorePoint;
	}

	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
}
