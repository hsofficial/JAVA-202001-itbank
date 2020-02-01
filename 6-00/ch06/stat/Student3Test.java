package ch06.stat;

public class Student3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Student3.getSerialNumber();
		System.out.println(num);
		System.out.println();
		
		Student3 student1 = new Student3();
		student1.setStudentName("dlwlrma");
		System.out.println(student1.getStudentName() + " 학생의 학번은 " + student1.getStudentID());

		
		Student3 student2 = new Student3();
		student2.setStudentName("jieun");
		System.out.println(student2.getStudentName() + " 학생의 학번은 " + student2.getStudentID());
		
		System.out.println();
		num = Student3.getSerialNumber();
		System.out.println(num);

	}

}
