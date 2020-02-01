package ch10.tamplate;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void parking() {
		
	}
	
	public void startCar() {
		System.out.println("on");
	}
	public void turnOff() {
		System.out.println("off");
	}
	
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		parking();
		turnOff();
	}
}
