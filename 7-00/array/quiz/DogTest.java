package ch07.array.quiz;

public class DogTest {
	public static void main(String[] args) {
		// ��ü �迭 ����
		Dog[] dogArray = new Dog[5];
		
		// �迭 ��� �ʱ�ȭ(����)
		dogArray[0] = new Dog("����", "ġ�Ϳ�");
		dogArray[1] = new Dog("�ǻ�", "������");
		dogArray[2] = new Dog("����", "��찳");
		dogArray[3] = new Dog("�κ�", "����Ƽ��");
		dogArray[4] = new Dog("����", "Ǫ��");
//		dogArray[5] = new Dog();	//Index 5 out of bounds for length 5 : ����� ���� �ʰ�

		// �迭 ��� �ݺ������� ���
		for(int i = 0; i < dogArray.length; i++) {	// dogArray.length : ��� ����
			System.out.println(dogArray[i].showDogInfo());
		}
		
		System.out.println("------------------");
		for(Dog dog : dogArray) {	// ��Ұ� �����ϴ� ���� ��� ��Ҹ� ��ȸ�Ͽ� ���
			System.out.println(dog.showDogInfo());
		}
		
	}
}





