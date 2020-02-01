package ch08.inheritance.upcasting;

public class VIPCustomer extends Customer {
	private int agentID;
	private double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer()");
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.customerGrade = "VIP";
		this.agentID = agentID;
		bonusRatio = 0.05;
		saleRatio = 0.1;
//		System.out.println("VIPCustomer(int customerID, String customerName, int agentID)");
	}

	
	@Override
	public int calcPrice(int price) {	// 반환형, 메서드 이름, 매개변수 자료형, 매개 변수 개수 동일해야 함.
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 전문 상담요원 번호는 " + agentID + "입니다.";
	}
	
//	public String showVIPCustomerInfo() {
//		return customerName + "고객님의 등급은 " + customerGrade + "이고, " + "보너스 적립율은 " + (bonusRatio*100) +  "%입니다.";
//	}
	
	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
}
