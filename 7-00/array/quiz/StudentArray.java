package ch07.array.quiz;

public class StudentArray {
	public static void main(String[] args) {
		// �л� �迭 ���� ���� students ���� �� �迭 ����
		Student[] students = new Student[3];
		// �迭 ��� �ʱ�ȭ
		students[0] = new Student("James");
		students[1] = new Student("Tomas");
		students[2] = new Student("Edward");

		/*for (int i = 0; i < students.length; i++) {
			students[i].showStudentInfo();
		}*/
		
		// Enhanced for������ �����ϸ�?
		// for(�ڷ��� ���� : �迭) { ���� �ڵ�; }
		for(Student s : students) {		// �迭 ��Ұ� �����ϴ� ���� �ݺ�
			s.showStudentInfo();
		}
	
	}
}
