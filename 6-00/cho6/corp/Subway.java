package cho6.corp;

public class Subway {
	private String lineNumber;
	private int money;
	private int SubwayPassenger;
	
	public Subway(String lineNumber) {
		super();
		this.lineNumber = lineNumber;
	}

	public String getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getSubwayPassenger() {
		return SubwayPassenger;
	}
	public void setSubwayPassenger(int SubwayPassenger) {
		this.SubwayPassenger = SubwayPassenger;
	}
	
	void printInfo() {
		System.out.println(lineNumber + " ÁöÇÏÃ¶, "+ SubwayPassenger + "¸í Å¾½Â, ¼öÀÔÀº " + money);
	}
	
	void take(int money) {
		this.SubwayPassenger++;
		this.money += money;
	}
}
