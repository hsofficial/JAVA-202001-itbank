package ch10.tamplate;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManualCar mCar = new ManualCar();
		mCar.run();
		
		System.out.println("==================");
		
		AICar aCar = new AICar();
		aCar.run();
	}
}
