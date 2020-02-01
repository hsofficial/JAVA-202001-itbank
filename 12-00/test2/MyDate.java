package ch12.test2;

public class MyDate {
	int day;
	int month;
	int year;
	int checksum;
	
	public MyDate() {
		this(1000,1,1);
	}
	
	public MyDate(int year, int month, int day) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.checksum = (year*10000)+(month*100)+day;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return checksum;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate std = (MyDate)obj;
			
			if(this.checksum == std.checksum)
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return year+"/"+month+"/"+day;
	}
	
	
}
