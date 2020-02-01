package singleton;

public class Company {
	private static Company instance = new Company();
	
	private Company() {
		System.out.println("������ ȸ��");
	}
	
	public static Company getInstance() {
		// ������� �ڵ�
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
