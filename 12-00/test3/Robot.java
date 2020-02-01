package ch12.test3;

class Robot {
}

class DanceRobot extends Robot{
	DanceRobot(){
		System.out.println("create dance robot");
	}
	void dance() {
		System.out.println("dance");
	}
}

class SingRobot extends Robot{
	SingRobot(){
		System.out.println("create SingRobot");
	}
	void sing() {
		System.out.println("Sing");
	}
}

class DrawRobot extends Robot{
	DrawRobot(){
		System.out.println("create draw robot");
	}
	void draw() {
		System.out.println("draw");
	}
}