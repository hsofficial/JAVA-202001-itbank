package quiz.car;

public class CarFactory {
	private static CarFactory instance = new CarFactory();

	private CarFactory() { }

	public static CarFactory getInstance() {	// ������ �ν��Ͻ��� �ܺο��� ����� �� �ֵ��� ����
		if (instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}

	public Car createCar() {
		Car car = new Car();
		return car;
	}
}
