package ch08;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		System.out.println(customer.getCustomerGrade() + ", "+customer.getBonusRatio());
		
		Customer cus1 = new Customer(100001, "dlwlrma");
		System.out.println(cus1.showCustomerInfo());
		
		VIPCustomer vip1 = new VIPCustomer();
		System.out.println(vip1.showVIPCustomerInfo());
		
		VIPCustomer vip2 = new VIPCustomer(200001, "kim", 1234);
		System.out.println(vip2.showVIPCustomerInfo());
		
	}

}
