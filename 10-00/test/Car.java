package ch10.test;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void start();
	public abstract void off();
	
	public void wash() {
		System.out.println("car-wash");
	}
	
	final public void run() {
		start();
		drive();
		stop();
		off();
		wash();
	}
}
