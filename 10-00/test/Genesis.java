package ch10.test;

public class Genesis extends Car {

	@Override
	public void drive() {
		System.out.println("Genesis-drive");
	}

	@Override
	public void stop() {
		System.out.println("Genesis-stop");
	}

	@Override
	public void start() {
		System.out.println("Genesis-start");
	}

	@Override
	public void off() {
		System.out.println("Genesis-off");
	}
}
