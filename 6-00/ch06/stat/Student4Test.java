package ch06.stat;

public class Student4Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Student4.getSerialNumber();
		System.out.println(num);
		int num2 = Student4.getCardNumber();
		System.out.println(num2);
		System.out.println();
		
		Student4 student1 = new Student4();
		student1.setStudentName("dlwlrma");
		System.out.println(student1.getStudentName() + " �л��� �й��� " + student1.getStudentID() + ", ī���ȣ�� " + student1.getStudentcardID());

		
		Student4 student2 = new Student4();
		student2.setStudentName("jieun");
		System.out.println(student2.getStudentName() + " �л��� �й��� " + student2.getStudentID() + ", ī���ȣ�� " + student2.getStudentcardID());
		
		System.out.println();
		num = Student4.getSerialNumber();
		System.out.println(num);
		num2 = Student4.getCardNumber();
		System.out.println(num2);
	}

}
