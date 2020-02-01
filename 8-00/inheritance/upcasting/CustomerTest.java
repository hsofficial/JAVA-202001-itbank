package ch08.inheritance.upcasting;

public class CustomerTest {
	public static void main(String[] args) {
		int price = 10000;
		// ������ �� ��ȯ : �θ� Ÿ���� ������ ��� �� ����.
		Customer customer = new Customer(1001, "�ʸ���");
		customer.bonusPoint = 1000;

		System.out.println(customer.showCustomerInfo());
		System.out.println("���� �ݾ� : " + customer.calcPrice(price));
		System.out.println(customer.showCustomerInfo());
		
		System.out.println("------------------------------------------------");
		Customer vip = new VIPCustomer(1004, "������", 7890);// ������� �ν��Ͻ��� �޼��尡 ȣ��Ǵ� ���� �޼��� ����
		vip.bonusPoint = 5000;
		
		System.out.println(vip.showCustomerInfo());
		System.out.println("���� �ݾ� : " + vip.calcPrice(price));
		System.out.println(vip.showCustomerInfo());
		
		//vip.showCustomerInfo();	// �θ��� �޼��常 ���� ����
		
		
		/*Customer customer = new Customer();		
		System.out.println(customer.getCustomerGrade() + ", " + customer.getBonusRatio());
		
		Customer customerLee = new Customer(10001, "�̼���");
//		System.out.println(customerLee.getCustomerGrade() + ", " + customerLee.getBonusRatio());
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer vipCustomer = new VIPCustomer();
		System.out.println(vipCustomer.showVIPCustomerInfo());
		
		VIPCustomer vipKim = new VIPCustomer(20001, "������", 7890);
		System.out.println(vipKim.showVIPCustomerInfo());*/
		
		
	}
}
