package ch13.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	public Class loadClass(String fileName, String className) 
			throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}

	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		String fileName = "a.txt";
		String className = "java.lang.String";
		
		try {
			test.loadClass(fileName, className);
//			int result = 1/0;
			throw new Exception();
		} catch (FileNotFoundException | ClassNotFoundException | ArithmeticException e) {
			System.out.println("Exception : "+e);
		} catch (Exception e) {
			System.out.println("unknownException : "+e);
		} 
		
		/*
		try {
			test.loadClass(fileName, className);
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (ClassNotFoundException e) {
			System.out.println("class not found");
		} finally {
			System.out.println("finally block");
		}
		System.out.println("process complete");
		*/
		
	}
}
