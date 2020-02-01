package ch07.array.quiz;

public class DogTest {
	public static void main(String[] args) {
		// 객체 배열 생성
		Dog[] dogArray = new Dog[5];
		
		// 배열 요소 초기화(설정)
		dogArray[0] = new Dog("꼬미", "치와와");
		dogArray[1] = new Dog("뽀삐", "진돗개");
		dogArray[2] = new Dog("해피", "삽살개");
		dogArray[3] = new Dog("두부", "마르티스");
		dogArray[4] = new Dog("콩이", "푸들");
//		dogArray[5] = new Dog();	//Index 5 out of bounds for length 5 : 요소의 개수 초과

		// 배열 요소 반복문으로 출력
		for(int i = 0; i < dogArray.length; i++) {	// dogArray.length : 요소 개수
			System.out.println(dogArray[i].showDogInfo());
		}
		
		System.out.println("------------------");
		for(Dog dog : dogArray) {	// 요소가 존재하는 동안 모든 요소를 순회하여 출력
			System.out.println(dog.showDogInfo());
		}
		
	}
}





