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
	public int calcPrice(int price) {	// ��ȯ��, �޼��� �̸�, �Ű����� �ڷ���, �Ű� ���� ���� �����ؾ� ��.
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "��� ���� ����� ��ȣ�� " + agentID + "�Դϴ�.";
	}
	
//	public String showVIPCustomerInfo() {
//		return customerName + "������ ����� " + customerGrade + "�̰�, " + "���ʽ� �������� " + (bonusRatio*100) +  "%�Դϴ�.";
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
