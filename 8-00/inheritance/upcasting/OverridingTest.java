package ch08.inheritance.upcasting;

public class OverridingTest {
	public static void main(String[] args) {
		// Ŭ���� ���� ����Ͽ� ���� �ݾ� ���.
		Customer customer = new Customer(10010, "������");
		customer.bonusPoint = 1000;
		
		VIPCustomer vipCustomer = new VIPCustomer(10020, "�ʸ���", 7890);
		vipCustomer.bonusPoint = 10000;
		
		Customer vc = new VIPCustomer(10030, "�ٸ���", 6543);
		vc.bonusPoint = 5000;
		
		int price = 10000;
		
		System.out.println(customer.getCustomerName() + "���� ���� �ݾ��� " 
					+ customer.calcPrice(price) + "���Դϴ�.");
		System.out.println(customer.getBonusPoint());
		
		System.out.println(vipCustomer.getCustomerName() + "���� ���� �ݾ��� " 
					+ vipCustomer.calcPrice(price) + "���Դϴ�.");
		System.out.println(vipCustomer.getBonusPoint());
		
		System.out.println(vc.getCustomerName() + "���� ���� �ݾ��� " 
				+ vc.calcPrice(price) + "���Դϴ�.");		
		System.out.println(vc.getBonusPoint());
	}
}
