package ch09;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
//		super();		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price -(int) (price * saleRatio);
		
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	public String showVIPCustomerInfo() {
		return customerName +"("+customerGrade+") bonusratio(%) : "+(bonusRatio * 100);
	}

	public int getAgentID() {
		return agentID;
	}
	public double getSaleRatio() {
		return saleRatio;
	}
	
}
