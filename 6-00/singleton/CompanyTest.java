package singleton;

public class CompanyTest {
	public static void main(String[] args) {
		Company company1  = Company.getInstance();
		Company company2  = Company.getInstance();
		Company company3  = Company.getInstance();
		
		String result = (company1 == company2) ? "�� ȸ��� ���� ���� ��" : "";
		System.out.println("company1�� company2 " + result);
	}
}
