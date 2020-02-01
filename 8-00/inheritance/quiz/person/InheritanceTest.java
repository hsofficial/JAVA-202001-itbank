package ch08.inheritance.quiz.person;

public class InheritanceTest {
	public static void main(String[] args) {
		Man m = new Man();
		// 설정자 메서드를 이용하여 객체의 인스턴스 변수 설정
		m.setNo(871023);
		m.setAge(27);
		m.setGender("M");
		
		// 접근자(반환자) 메서드를 출력 메서드의 인수로 호출하여 결과를 확인
//		System.out.println("남자의 일련번호 : " + m.getNo());
//		System.out.println("남자의 나이 : " + m.getAge());
		m.print();// 부모의 메서드 호출
		System.out.println(m.getClass().getSimpleName() + " 성별 : " + m.getGender());
		
		Woman w = new Woman();
		w.setNo(891225);
		w.setAge(29);
		w.setHeight(165);
		w.print();
		System.out.println(w.getClass().getSimpleName() + " 키 : " + w.getHeight());
		/*System.out.println("\n여자의 일련번호 : " + w.getNo()		// 여자의 일련번호
							+ "\n여자의 나이 : " + w.getAge()		// 여자의 나이
							+ "\n여자의 키 : " + w.getHeight());	// 여자의 키*/
	}
}


