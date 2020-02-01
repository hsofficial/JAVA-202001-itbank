package ch08.inheritance.upcasting;

public class OverridingTest {
	public static void main(String[] args) {
		// 클래스 형에 기반하여 지불 금액 계산.
		Customer customer = new Customer(10010, "나몰라");
		customer.bonusPoint = 1000;
		
		VIPCustomer vipCustomer = new VIPCustomer(10020, "너몰라", 7890);
		vipCustomer.bonusPoint = 10000;
		
		Customer vc = new VIPCustomer(10030, "다몰라", 6543);
		vc.bonusPoint = 5000;
		
		int price = 10000;
		
		System.out.println(customer.getCustomerName() + "님의 지불 금액은 " 
					+ customer.calcPrice(price) + "원입니다.");
		System.out.println(customer.getBonusPoint());
		
		System.out.println(vipCustomer.getCustomerName() + "님의 지불 금액은 " 
					+ vipCustomer.calcPrice(price) + "원입니다.");
		System.out.println(vipCustomer.getBonusPoint());
		
		System.out.println(vc.getCustomerName() + "님의 지불 금액은 " 
				+ vc.calcPrice(price) + "원입니다.");		
		System.out.println(vc.getBonusPoint());
	}
}
