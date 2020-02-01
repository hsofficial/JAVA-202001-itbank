package singleton;

public class CompanyTest {
	public static void main(String[] args) {
		Company company1  = Company.getInstance();
		Company company2  = Company.getInstance();
		Company company3  = Company.getInstance();
		
		String result = (company1 == company2) ? "두 회사는 같은 참조 값" : "";
		System.out.println("company1과 company2 " + result);
	}
}
