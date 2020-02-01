package ch10.test;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Car> cl = new ArrayList<Car>();
		
		cl.add(new Sonata());
		cl.add(new Grandeur());
		cl.add(new Avante());
		cl.add(new Genesis());
		
		for(Car car : cl) {
			car.run();
			System.out.println("===========================");
		}
	}

}
