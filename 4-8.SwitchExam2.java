package ch04;

import java.util.Scanner;

public class SwitchExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String sc;
		
		System.out.println("input string(T/t/F/f/S/s)");
		sc = input.next();
		
		switch(sc) {
		case "t":	case "T":
			System.out.println("Thursday");
			break;
			
		case "f":	case "F":
			System.out.println("Friday");
			break;
			
		case "S":	case "s":
			System.out.println("Saturday");
			break;

			
		default:
			System.out.println("ERROR");
		}
	}

}
