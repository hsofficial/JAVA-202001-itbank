package ch12.object;

public class BookToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		Book book2 = new Book("booktitle1", "author1");
		
		System.out.println(book1);
		System.out.println(book2);
	}

}
