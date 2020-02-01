package quiz.car;

public class CarFactoryTest {
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();	// �̱��� ����
		
		Car mySonata = factory.createCar();		// createCar �޼��忡�� Car ����
		Car yourSonata = factory.createCar();

		System.out.println(mySonata.getCarNum());		// 10001
		System.out.println(yourSonata.getCarNum());		// 10002
	}
}
