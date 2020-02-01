package ch06.stat;

public class Student2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Student2.serialNumber);
		System.out.println();
		
		Student2 student1 = new Student2();
		student1.setStudentName("dlwlrma");
		System.out.println(student1.getStudentName() + " 학생의 학번은 " + student1.getStudentID());

		
		Student2 student2 = new Student2();
		student2.setStudentName("jieun");
		System.out.println(student2.getStudentName() + " 학생의 학번은 " + student2.getStudentID());
		
		System.out.println();
		System.out.println(Student2.serialNumber);
	}

}
