package singleton;

public class Company {
	private static Company instance = new Company();
	
	private Company() {
		System.out.println("유일한 회사");
	}
	
	public static Company getInstance() {
		// 방어적인 코드
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
