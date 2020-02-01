package ch04;

public class IfTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 15;
		
		if(age <= 19)// if 문
			System.out.println("미성년자입니다");
		else
			System.out.println("성인입니다");
		
		int score = 80;
		
		if(score > 60)// if~else 문
			System.out.println("합격입니다");
		
		else
			System.out.println("불합격입니다");
	}

}
