package ch06.stat;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.setStudentName("dlwlrma");
		System.out.println(student1.serialNumber);
		
		Student.serialNumber++;
		System.out.println();
		
		Student student2 = new Student();
		student2.setStudentName("jieun");
		System.out.println(student1.serialNumber);
		System.out.println(student2.serialNumber);
	}

}
