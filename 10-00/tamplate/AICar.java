package ch10.tamplate;

public class AICar extends Car {
	@Override
	public void drive() {
		System.out.println("drive_AICar");
	}
	
	@Override
	public void stop() {
		System.out.println("stop_AICar");
	}

	@Override
	public void wiper() {
		System.out.println("wiper_AICar");	
	}

	@Override
	public void parking() {
		System.out.println("parking_AICar");
		super.parking();
	}
}
