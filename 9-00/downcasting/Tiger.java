package ch09.downcasting;

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("movetiger");
	}
	public void sound() {
		System.out.println("nyang");
	}
}
