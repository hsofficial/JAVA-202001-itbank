package ch04;

public class LimitedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		/*
		for(;;) {
			System.out.println(i);
			i++;
		}
		*/
		
		/*
		while(true) {
			System.out.println(i);
			
			if(i == 10)
				break;
			
			i++;
		}
		*/
		
		do {
			if(i>10)
				break;
			
			System.out.println(i);
			++i;
		}while(true);
	}

}
