package ch08.inheritance.upcasting;

public class CustomerTest {
	public static void main(String[] args) {
		int price = 10000;
		// 묵시적 형 변환 : 부모 타입의 변수에 담길 수 있음.
		Customer customer = new Customer(1001, "너몰라");
		customer.bonusPoint = 1000;

		System.out.println(customer.showCustomerInfo());
		System.out.println("지불 금액 : " + customer.calcPrice(price));
		System.out.println(customer.showCustomerInfo());
		
		System.out.println("------------------------------------------------");
		Customer vip = new VIPCustomer(1004, "나몰라", 7890);// 만들어진 인스턴스의 메서드가 호출되는 가상 메서드 원리
		vip.bonusPoint = 5000;
		
		System.out.println(vip.showCustomerInfo());
		System.out.println("지불 금액 : " + vip.calcPrice(price));
		System.out.println(vip.showCustomerInfo());
		
		//vip.showCustomerInfo();	// 부모의 메서드만 접근 가능
		
		
		/*Customer customer = new Customer();		
		System.out.println(customer.getCustomerGrade() + ", " + customer.getBonusRatio());
		
		Customer customerLee = new Customer(10001, "이순신");
//		System.out.println(customerLee.getCustomerGrade() + ", " + customerLee.getBonusRatio());
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer vipCustomer = new VIPCustomer();
		System.out.println(vipCustomer.showVIPCustomerInfo());
		
		VIPCustomer vipKim = new VIPCustomer(20001, "김유신", 7890);
		System.out.println(vipKim.showVIPCustomerInfo());*/
		
		
	}
}
