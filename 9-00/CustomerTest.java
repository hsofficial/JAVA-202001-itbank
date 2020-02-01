package ch09;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		GoldCustomer cus1 = new GoldCustomer();
		System.out.println(cus1.showCustomerInfo());
		
		VIPCustomer vip1 = new VIPCustomer();
		System.out.println(vip1.showVIPCustomerInfo());
		
		VIPCustomer vip2 = new VIPCustomer(200001, "kim", 1234);
		System.out.println(vip2.showVIPCustomerInfo());
		
		customerList.add(cus1);
		customerList.add(vip1);
		customerList.add(vip2);
		
		customerList.add(new VIPCustomer(200002, "lee", 8888));
		
		System.out.println("====================================");
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 100000;
		
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.customerName + " , "+ cost +" won. bonus point is " + customer.bonusPoint);
		}
	}

}
