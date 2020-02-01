package ch09.downcasting;

import java.util.ArrayList;

public class AnimalTest {
	public static void main(String[] args) {
		ArrayList<Animal> animal = new ArrayList<Animal>();
		
		animal.add(new Animal());
		animal.add(new Tiger());
		
		for (Animal ani : animal) {
			ani.move();
		}
		
		System.out.println("=================================");
		
		for(int i = 0 ; i<animal.size(); i++) {
			Animal.a = animal.get(i);
			
			if(a instanceof Tiger) {
				Tiger tiger = (Tiger) a;
				tiger.sound();
			}
		}
	}
	
	public void addAnimal() {
		ArrayList<Animal> animal = new ArrayList<Animal>();
		
		animal.add(new Animal());
		animal.add(new Tiger());
		
		for (Animal ani : animal) {
			ani.move();
		
		}
	}
}
