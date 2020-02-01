package ch07.arraylist;

public class Subject {
	private String subjectName;	// �����
	private int scorePoint;		// ����
	
	public Subject() {
		this("�����", 0);
	}
	
	public Subject(String subjectName, int scorePoint) {	// �Ű� ���� ������
		this.subjectName = subjectName;
		this.scorePoint = scorePoint;
	}

	// ������/ ������ �޼���
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
