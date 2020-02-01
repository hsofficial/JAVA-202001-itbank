package ch13.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println(e);
				}
			}
			
			System.out.println("run fin");
		}
		System.out.println("end");
	}
}
