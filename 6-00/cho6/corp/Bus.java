package cho6.corp;

public class Bus {
	private int busNumber;
	private int money;
	private int busPassenger;
	
	public Bus(int busNumber) {
		super();
		this.busNumber = busNumber;
	}

	public int getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getBusPassenger() {
		return busPassenger;
	}
	public void setBusPassenger(int busPassenger) {
		this.busPassenger = busPassenger;
	}
	
	void printInfo() {
		System.out.println(busNumber + "번 버스, "+ busPassenger + "명 탑승, 수입은 " + money);
	}
	
	void take(int money) {
		this.busPassenger++;
		this.money += money;
	}
}
