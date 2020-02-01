package ch07.array;

public class BookArray {
	public static void main(String[] args) {
		// Book 타입의 배열 요소가 5개인 변수 선언
		Book[] library = new Book[5];
		
		// 배열의 요소를 추가
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생텍쥐페리");
			
		// 반복문에 도서 정보를 확인하는 메서드를 호출
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo();// i번째 책 정보
		}
		
		// 반복문을 이용하여 Book 타입의 배열 요소 확인?
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);	// null 생성된 객체가 없음, 참조 주소값
		}
		
	}
}
