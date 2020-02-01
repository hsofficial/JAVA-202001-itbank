package ch10;

abstract class Animal {
	abstract void move();
	abstract void shape();
}

class Lion extends Animal{
	@Override
	void move() {
		System.out.println("move()lion");
	}
	@Override
	void shape() {
		System.out.println("shape()lion");
	}
	
	void hunting() {
		System.out.println("hunting()lion");
	}
}

class Goldfish extends Animal{
	@Override
	void move() {
		System.out.println("move()Goldfish");
	}
	@Override
	void shape() {
		System.out.println("shape()Goldfish");
	}
	
	void swimming() {
		System.out.println("swimming()goldfish");
	}
}

class Eagle extends Animal{
	@Override
	void move() {
		System.out.println("move()Eagle");
	}
	@Override
	void shape() {
		System.out.println("shape()Eagle");
	}
	
	void flying() {
		System.out.println("flying()eagle");
	}
}
