package ch07.array;

public class ObjectCopy1 {
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
		
		// 배열 요소 복사
		System.arraycopy(library1, 0, library2, 0, library1.length);
		// 참조 값을 복사하여 동시에 수정이 됨...shallow copy
		
		for(Book l1 : library1)
			System.out.println(l1);
		System.out.println("------------------------");
		for(Book l2 : library2)
			System.out.println(l2);
		
		// library1[0] 요소를 수정(setXXX 설정자 메서드 이용)
		library1[0].setBookName("나목");
		library1[0].setAuthor("박완서");
		
		for(Book i : library1)
			i.showBookInfo();
		System.out.println("------------------------");
		for(Book j : library2)
			j.showBookInfo();			
	}
}








