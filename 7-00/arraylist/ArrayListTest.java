package ch07.arraylist;

import java.util.ArrayList;		// Ctrl+Shift+O

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> sList = new ArrayList<String>();	// ArrayList 생성
		// 요소 추가 
		sList.add("abc");
		sList.add("ijk");
		sList.add("xyz");
		
		for(int i=0; i<sList.size(); i++) {
			String s = sList.get(i);	// 대입 값이 String이므로 형 변환X
//			String s = (String) sList.get(i);// get(i): 반환 값이 Object이므로 형 변환
			//Type mismatch: cannot convert from Object to String
			System.out.println(s);
		}
		
	}
}
