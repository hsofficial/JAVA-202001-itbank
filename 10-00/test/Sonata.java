package ch10.test;

public class Sonata extends Car {

	@Override
	public void drive() {
		System.out.println("Sonata-drive");
	}

	@Override
	public void stop() {
		System.out.println("Sonata-stop");
	}

	@Override
	public void start() {
		System.out.println("Sonata-start");
	}

	@Override
	public void off() {
		System.out.println("Sonata-off");
	}
}
