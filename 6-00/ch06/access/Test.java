package ch06.access;

public class Test {
	private int x;
	private String str;
	private double y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

	public void print() {
		System.out.println("===print() in test class===");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("str = "+str);
	}
}
