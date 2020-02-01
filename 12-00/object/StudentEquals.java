package ch12.object;

import ch12.test1.Student;

public class StudentEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("dlwlrma", 930516);
		Student s2 = s1;
		Student ss = new Student("dlwlrma", 930516);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(ss);
		System.out.println();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(ss.hashCode());
		System.out.println();
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(ss));
		System.out.println();
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(ss));
		System.out.println();
	}

}
