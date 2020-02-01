package ch06.access;

public class MyDate {
	private int day;
	int month;
	int year;
	
	public void setDay(int day) {
		if (month == 2) {
			if(day < 1 || day > 28) {
				System.out.println("error!");
				System.out.println("day : " + day);
			}else {
				this.day = day;
				System.out.println("day : " + day);
			}
		}
	}
}
