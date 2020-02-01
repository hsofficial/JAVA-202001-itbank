package ch09;

public class GoldCustomer extends Customer{
	double saleRatio;
	
	public GoldCustomer() {
//		super();		
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price -(int) (price * saleRatio);
	}
	
	public GoldCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.01;
		saleRatio = 0.1;
	}
	public String showCustomerInfo() {
		return customerName +"("+customerGrade+") bonusratio(%) : "+(bonusRatio * 100);
	}


	public double getSaleRatio() {
		return saleRatio;
	}
	
}
