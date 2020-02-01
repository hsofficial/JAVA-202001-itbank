package ch11.interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer =  new Customer();
		customer.buy();
		customer.sell();
		System.out.println();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		System.out.println();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		System.out.println();
		
		if(seller instanceof Customer) {
			Customer customer2 = (Customer)seller;
			
			customer2.buy();
			customer2.sell();
		}
		System.out.println();
		
		buyer.order();
		seller.order();
		customer.order();
	}

}
