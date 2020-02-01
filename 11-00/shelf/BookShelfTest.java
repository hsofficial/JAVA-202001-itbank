package ch11.shelf;

public class BookShelfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookShelf shelfQueue = new BookShelf();
		
		shelfQueue.enQueue("book1");
		shelfQueue.enQueue("book2");
		shelfQueue.enQueue("book3");
		
		int count = shelfQueue.getSize();
		System.out.println("cnt : " + count);
		
		shelfQueue.deQueue();
		System.out.println("cnt : " + shelfQueue.getSize());
	}

}
