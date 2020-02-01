package ch10.test;

public class Grandeur extends Car {

	@Override
	public void drive() {
		System.out.println("Grandeur-drive");
	}

	@Override
	public void stop() {
		System.out.println("Grandeur-stop");
	}

	@Override
	public void start() {
		System.out.println("Grandeur-start");
	}

	@Override
	public void off() {
		System.out.println("Grandeur-off");
	}
}
