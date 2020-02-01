package ch04;

import java.io.IOException;

public class DoWhile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int in = 0;
		System.out.println("input sentence");
		System.out.println("stop key is < x > .");
		do {
			in = System.in.read();
			System.out.println((char)in);
		}while( in != -1 && in !='x');
	}

}
