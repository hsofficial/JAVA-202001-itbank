package ch07.arraylist;

import java.util.ArrayList;
import ch07.array.Book;	// �ܺο� �ִ� Ŭ������ �������� ���

public class BookArrayList {
	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("�¹���1", "������"));
		library.add(new Book("�¹���2", "������"));
		library.add(new Book("�¹���3", "������"));
		library.add(new Book("�¹���4", "������"));
		library.add(new Book("�¹���5", "������"));
		library.add(new Book("�¹���6", "������"));
		
		// �ݺ����� �̿��Ͽ� ArrayList ��ҵ� ���
		for(int i=0; i<library.size(); i++) {
			Book book = library.get(i);
//			System.out.println(book);
			book.showBookInfo();
		}
	}
}
