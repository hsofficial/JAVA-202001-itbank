package ch05;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alp = new char[26];
		char ch = 'A';
		
		for(int i = 0; i<alp.length; i++, ch++) {
			alp[i] = ch;
		}
		
		for(int i = 0; i<alp.length; i++) {
			System.out.println(alp[i] + " , " + (int)alp[i]);
		}
	}

}
