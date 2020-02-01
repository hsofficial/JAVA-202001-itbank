package ch07.array;

public class ObjectCopy1 {
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
		
		// �迭 ��� ����
		System.arraycopy(library1, 0, library2, 0, library1.length);
		// ���� ���� �����Ͽ� ���ÿ� ������ ��...shallow copy
		
		for(Book l1 : library1)
			System.out.println(l1);
		System.out.println("------------------------");
		for(Book l2 : library2)
			System.out.println(l2);
		
		// library1[0] ��Ҹ� ����(setXXX ������ �޼��� �̿�)
		library1[0].setBookName("����");
		library1[0].setAuthor("�ڿϼ�");
		
		for(Book i : library1)
			i.showBookInfo();
		System.out.println("------------------------");
		for(Book j : library2)
			j.showBookInfo();			
	}
}








