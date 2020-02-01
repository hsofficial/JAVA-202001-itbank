package ch10.test;

public class Avante extends Car {

	@Override
	public void drive() {
		System.out.println(getClass().getSimpleName()+"-drive");
	}

	@Override
	public void stop() {
		System.out.println(getClass().getSimpleName()+"-stop");
	}

	@Override
	public void start() {
		System.out.println(getClass().getSimpleName()+"-start");
	}

	@Override
	public void off() {
		System.out.println(getClass().getSimpleName()+"-off");
	}
}
