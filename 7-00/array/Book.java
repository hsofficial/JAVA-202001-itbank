package ch07.array;

public class Book {
	private String bookName;	// 도서명
	private String author;		// 저자명
	
	public Book() {
		// 디폴트 생성자
	}

	public Book(String bookName, String author) {	// 매개 변수 생성자
		this.bookName = bookName;
		this.author = author;
	}

	public void showBookInfo() {	// 도서 정보 출력 메서드
		System.out.println(bookName + ", " + author);
	}
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}		
}
