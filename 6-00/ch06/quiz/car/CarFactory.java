package quiz.car;

public class CarFactory {
	private static CarFactory instance = new CarFactory();

	private CarFactory() { }

	public static CarFactory getInstance() {	// 유일한 인스턴스를 외부에서 사용할 수 있도록 설정
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
