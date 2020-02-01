package ch06.student;

import java.text.DecimalFormat;

public class Student {
	int num = 0;
	String name = "init";
	int kor = 0;
	int mat = 0;
	int eng = 0;
	int sum = 0;
	double avg = 0;
	
	void print() {
		System.out.println(num + ", " + name);
		sum = kor+mat+eng;
		avg = (double) sum / 3;
		
		DecimalFormat df = new DecimalFormat("0.#");
		

		System.out.println("sum : " + sum);
		System.out.println("avg : " + df.format(avg));
	}

}
