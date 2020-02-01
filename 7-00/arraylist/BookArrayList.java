package ch07.arraylist;

import java.util.ArrayList;
import ch07.array.Book;	// 외부에 있는 클래스를 가져오는 방법

public class BookArrayList {
	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("태백산맥1", "조정래"));
		library.add(new Book("태백산맥2", "조정래"));
		library.add(new Book("태백산맥3", "조정래"));
		library.add(new Book("태백산맥4", "조정래"));
		library.add(new Book("태백산맥5", "조정래"));
		library.add(new Book("태백산맥6", "조정래"));
		
		// 반복문을 이용하여 ArrayList 요소들 출력
		for(int i=0; i<library.size(); i++) {
			Book book = library.get(i);
//			System.out.println(book);
			book.showBookInfo();
		}
	}
}
