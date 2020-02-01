package cho6.corp;

public class Student {
	private String studentName;
	private int money;
	
	public Student(String studentName, int money) {
		super();
		this.studentName = studentName;
		this.money = money;
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	void printInfo() {
		System.out.println(studentName + " 학생이 가진 돈은 " + money );
	}
	
	void takeBus(Bus bus) {
		bus.take(1200);
		this.money -= 1200;
	}
	
	void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
}
