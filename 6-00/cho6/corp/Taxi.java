package cho6.corp;

public class Taxi {
	private String taxiNumber;
	private int money;
	private int TaxiPassenger;
	
	public Taxi(String taxiNumber) {
		super();
		this.taxiNumber = taxiNumber;
	}

	public String gettaxiNumber() {
		return taxiNumber;
	}
	public void settaxiNumber(String taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getTaxiPassenger() {
		return TaxiPassenger;
	}
	public void setTaxiPassenger(int TaxiPassenger) {
		this.TaxiPassenger = TaxiPassenger;
	}
	
	void printInfo() {
		System.out.println(taxiNumber + "�� �ý�, "+ TaxiPassenger + "�� ž��, ������ " + money);
	}
	
	void take(int money) {
		this.TaxiPassenger++;
		this.money += money;
	}
}
