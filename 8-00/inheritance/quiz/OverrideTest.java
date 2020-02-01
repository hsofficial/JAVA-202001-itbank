package ch08.inheritance.quiz;

public class OverrideTest {
	public static void main(String[] args) {
		Manager managerKim = new Manager();
		managerKim.name = "James Kim";	// 상속 관계 클래스 멤버 접근
		managerKim.setAge(30);
		managerKim.job = "프로젝트 매니저";	// 동일 패키지 클래스 멤버 접근
		managerKim.print();
		System.out.println();
		
		Manager managerLee = new Manager();
		managerLee.name = "Tomas Lee";
		managerLee.setAge(15);
		managerLee.job = "싱어송 라이터";
		managerLee.print();
	}
}
