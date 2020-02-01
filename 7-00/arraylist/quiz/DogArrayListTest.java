package ch07.arraylist.quiz;

import java.util.ArrayList;
//import ch07.array.quiz.Dog;


public class DogArrayListTest {
	public static void main(String[] args) {
		// ArrayList<E> 배열이름 = new ArrayList<E>();
		ArrayList<Dog> list = new ArrayList<>();
		
		// ArrayList에 요소 추가
		list.add(new Dog("멍멍이", "치와와"));	// 인스턴스를 생성 한 값을 리스트에 추가
		list.add(new Dog("뽀삐", "진돗개"));
		list.add(new Dog("해피", "삽살개"));
		list.add(new Dog("두부", "마르티스"));
		list.add(new Dog("콩이", "푸들"));
		list.add(new Dog());

		for(int i = 0; i < list.size(); i++) {	// list.size() : 리스트의 요소의 개수
			Dog dog = list.get(i);
			System.out.println(dog.showDogInfo());
		}
		
		System.out.println("=============");

		for(Dog dog : list) {
			System.out.println(dog.showDogInfo());
		}

	}
}




