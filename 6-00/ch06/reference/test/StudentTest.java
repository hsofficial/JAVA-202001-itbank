package ch06.reference.test;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		
		Student studentkim = new Student(10001, "dlwlrma");
		
		studentkim.setKorean("korean", 99);
		studentkim.setMath("math", 95);
		
		studentkim.showInfo();
		
		System.out.println("===================");
		
		Student student2 = new Student(10002, "jieun");
		
		student2.setKorean("korean", 98);
		student2.setMath("math", 100);
		
		student2.showInfo();
	}

}
