package ch07.arraylist;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(1001, "LEE");
		System.out.println("학번 : " + studentLee.getStudentID());
		System.out.println("이름 : " + studentLee.getStudentName());
		System.out.println();
		
		studentLee.addSubject("korean", 100);
		studentLee.addSubject("english", 99);
		studentLee.studentInfo();
		System.out.println();
		
		Student student2 = new Student(1002, "kim");
		student2.addSubject("korean", 100);
		student2.addSubject("english", 99);
		student2.addSubject("math", 98);
		student2.studentInfo();
		System.out.println();

	}
}
