package ch04;

public class IfTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 93;
		
		if(score>=90)
			System.out.println("A ���");
		
		else if(score>=80 && score<90)
			System.out.println("B ���");
		
		else if(score>=70 && score<80)
			System.out.println("C ���");
		
		else
			System.out.println("F ���");
	}

}
