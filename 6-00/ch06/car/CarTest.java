package ch06.car;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Car myCar = new Car();
		
		myCar.print();
		
		myCar.color = "red";
		myCar.print();
		myCar.speed = 1000;
		myCar.print();
		myCar.gear = 1;
		myCar.print();
		
		System.out.println("============");
		
		Car yourCar = new Car();
		
		yourCar.print();
		
		yourCar.color = "blue";
		yourCar.print();
		yourCar.speed = 100;
		yourCar.print();
		yourCar.gear = 1;
		yourCar.print();
		
		System.out.println("============");
		
		Car ourCar = new Car();
		
		ourCar.print();
		
		ourCar.color = "green";
		ourCar.print();
		ourCar.speed = 150;
		ourCar.print();
		ourCar.gear = 3;
		ourCar.print();
		
		System.out.println("============");
		
		System.out.println(myCar);
		System.out.println(yourCar);
		System.out.println(ourCar);
	}

}
