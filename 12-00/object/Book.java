package ch12.object;

class Book {
	String booktitle;
	String author;
	
	public Book() {
		this("none","none");
	}
	
	public Book(String booktitle, String author) {
		this.author = author;
		this.booktitle = booktitle;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "author : "+author+" , booktitle : "+booktitle;
	}
}
