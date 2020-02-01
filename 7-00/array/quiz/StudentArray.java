package ch07.array.quiz;

public class StudentArray {
	public static void main(String[] args) {
		// 학생 배열 참조 변수 students 선언 후 배열 생성
		Student[] students = new Student[3];
		// 배열 요소 초기화
		students[0] = new Student("James");
		students[1] = new Student("Tomas");
		students[2] = new Student("Edward");

		/*for (int i = 0; i < students.length; i++) {
			students[i].showStudentInfo();
		}*/
		
		// Enhanced for문으로 변경하면?
		// for(자료형 변수 : 배열) { 실행 코드; }
		for(Student s : students) {		// 배열 요소가 존재하는 동안 반복
			s.showStudentInfo();
		}
	
	}
}
