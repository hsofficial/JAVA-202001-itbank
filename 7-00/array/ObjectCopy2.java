package ch07.array;

public class ObjectCopy2 {
	public static void main(String[] args) {
		// Book 타입의 배열 요소가 5개인 변수 선언
		Book[] library1 = new Book[5];
		Book[] library2 = new Book[5];
		
		// 배열의 요소를 추가
		library1[0] = new Book("태백산맥", "조정래");
		library1[1] = new Book("데미안", "헤르만 헤세");
		library1[2] = new Book("어떻게 살 것인가", "유시민");
		library1[3] = new Book("토지", "박경리");
		library1[4] = new Book("어린왕자", "생텍쥐페리");
		
		// library2의 요소는 인스턴스를 새롭게 생성, 각각 다른 인스턴스가 메모리에 저장.
		library2[0] = new Book();
		library2[1] = new Book();
		library2[2] = new Book();
		library2[3] = new Book();
		library2[4] = new Book();
		
		// 반복문을 이용하여 각 요소들을 복사
		for(int i=0; i<library1.length; i++) {	// 내용, 값이 복사
			library2[i].setBookName(library1[i].getBookName()); // 도서명을 library1으로 부터 얻어와서 library2에 설정
			library2[i].setAuthor(library1[i].getAuthor()); // 저자명을 library1으로 부터 얻어와서 library2에 설정
		}
		
		System.out.println("library1=========");
		for(Book b : library1)
			b.showBookInfo();
		
		System.out.println("library2=========");
		for(Book b : library2)
			b.showBookInfo();
		
		// library1의 마지막 요소를 변경
		library1[4].setBookName("언어의 온도");
		library1[4].setAuthor("이기주");
		
		System.out.println();

		System.out.println("library1=========");
		for(Book b : library1)
			b.showBookInfo();
		
		System.out.println("library2=========");	// 요소 값 변경 없음...deep copy
		for(Book b : library2)
			b.showBookInfo();
	}
}








