package ch07.array;

public class ObjectCopy2 {
	public static void main(String[] args) {
		// Book Ÿ���� �迭 ��Ұ� 5���� ���� ����
		Book[] library1 = new Book[5];
		Book[] library2 = new Book[5];
		
		// �迭�� ��Ҹ� �߰�
		library1[0] = new Book("�¹���", "������");
		library1[1] = new Book("���̾�", "�츣�� �켼");
		library1[2] = new Book("��� �� ���ΰ�", "���ù�");
		library1[3] = new Book("����", "�ڰ渮");
		library1[4] = new Book("�����", "�������丮");
		
		// library2�� ��Ҵ� �ν��Ͻ��� ���Ӱ� ����, ���� �ٸ� �ν��Ͻ��� �޸𸮿� ����.
		library2[0] = new Book();
		library2[1] = new Book();
		library2[2] = new Book();
		library2[3] = new Book();
		library2[4] = new Book();
		
		// �ݺ����� �̿��Ͽ� �� ��ҵ��� ����
		for(int i=0; i<library1.length; i++) {	// ����, ���� ����
			library2[i].setBookName(library1[i].getBookName()); // �������� library1���� ���� ���ͼ� library2�� ����
			library2[i].setAuthor(library1[i].getAuthor()); // ���ڸ��� library1���� ���� ���ͼ� library2�� ����
		}
		
		System.out.println("library1=========");
		for(Book b : library1)
			b.showBookInfo();
		
		System.out.println("library2=========");
		for(Book b : library2)
			b.showBookInfo();
		
		// library1�� ������ ��Ҹ� ����
		library1[4].setBookName("����� �µ�");
		library1[4].setAuthor("�̱���");
		
		System.out.println();

		System.out.println("library1=========");
		for(Book b : library1)
			b.showBookInfo();
		
		System.out.println("library2=========");	// ��� �� ���� ����...deep copy
		for(Book b : library2)
			b.showBookInfo();
	}
}








