package ch07.arraylist.quiz;

import java.util.ArrayList;
import ch07.array.quiz.Student;

public class StudentArrayList {
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student("James"));
		students.add(new Student("Tomas"));
		students.add(new Student("Edward"));
		
		for(int i=0; i<students.size(); i++) {
			students.get(i).showStudentInfo();	// i��° �л��� showStudentInfo() �޼��� ȣ��
		}
	
		System.out.println("=================");
		for(Student s : students)
			s.showStudentInfo();
		
	}
}
