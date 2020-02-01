package ch08;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	public String showCustomerInfo() {
		return customerName +"("+customerGrade+") bonusratio(%) : "+(bonusRatio * 100);
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}
}
