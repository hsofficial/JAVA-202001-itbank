package ch10.tamplate;

public class ManualCar extends Car {
	@Override
	public void drive() {
		System.out.println("drive_manualcar");
	}
	
	@Override
	public void stop() {
		System.out.println("stop_manualcar");
	}

	@Override
	public void wiper() {
		System.out.println("wiper_manualcar");
	}
}
