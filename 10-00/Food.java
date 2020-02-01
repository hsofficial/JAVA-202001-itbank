package ch10;

abstract class Food {
	abstract void cook();
	abstract void taste();
}

class Noodle extends Food{
	@Override
	void cook() {
		System.out.println("cook()noodle");
	}
	@Override
	void taste() {
		System.out.println("taste()noodle");
	}
}

class Kimchi extends Food{
	@Override
	void cook() {
		System.out.println("cook()Kimchi");
	}
	@Override
	void taste() {
		System.out.println("taste()Kimchi");
	}
}


