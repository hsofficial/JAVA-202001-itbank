package ch07.array;

public class BookArray {
	public static void main(String[] args) {
		// Book Ÿ���� �迭 ��Ұ� 5���� ���� ����
		Book[] library = new Book[5];
		
		// �迭�� ��Ҹ� �߰�
		library[0] = new Book("�¹���", "������");
		library[1] = new Book("���̾�", "�츣�� �켼");
		library[2] = new Book("��� �� ���ΰ�", "���ù�");
		library[3] = new Book("����", "�ڰ渮");
		library[4] = new Book("�����", "�������丮");
			
		// �ݺ����� ���� ������ Ȯ���ϴ� �޼��带 ȣ��
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo();// i��° å ����
		}
		
		// �ݺ����� �̿��Ͽ� Book Ÿ���� �迭 ��� Ȯ��?
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);	// null ������ ��ü�� ����, ���� �ּҰ�
		}
		
	}
}
