package ch07.arraylist;

import java.util.ArrayList;		// Ctrl+Shift+O

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> sList = new ArrayList<String>();	// ArrayList ����
		// ��� �߰� 
		sList.add("abc");
		sList.add("ijk");
		sList.add("xyz");
		
		for(int i=0; i<sList.size(); i++) {
			String s = sList.get(i);	// ���� ���� String�̹Ƿ� �� ��ȯX
//			String s = (String) sList.get(i);// get(i): ��ȯ ���� Object�̹Ƿ� �� ��ȯ
			//Type mismatch: cannot convert from Object to String
			System.out.println(s);
		}
		
	}
}
