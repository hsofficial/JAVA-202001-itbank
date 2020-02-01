package ch07.arraylist.quiz;

import java.util.ArrayList;
//import ch07.array.quiz.Dog;


public class DogArrayListTest {
	public static void main(String[] args) {
		// ArrayList<E> �迭�̸� = new ArrayList<E>();
		ArrayList<Dog> list = new ArrayList<>();
		
		// ArrayList�� ��� �߰�
		list.add(new Dog("�۸���", "ġ�Ϳ�"));	// �ν��Ͻ��� ���� �� ���� ����Ʈ�� �߰�
		list.add(new Dog("�ǻ�", "������"));
		list.add(new Dog("����", "��찳"));
		list.add(new Dog("�κ�", "����Ƽ��"));
		list.add(new Dog("����", "Ǫ��"));
		list.add(new Dog());

		for(int i = 0; i < list.size(); i++) {	// list.size() : ����Ʈ�� ����� ����
			Dog dog = list.get(i);
			System.out.println(dog.showDogInfo());
		}
		
		System.out.println("=============");

		for(Dog dog : list) {
			System.out.println(dog.showDogInfo());
		}

	}
}




