package ch09;

public class AnimalTest {
public static void main(String[] args) {
	Animal[] animals = new Animal[4];
	animals[0] = new Animal();
	animals[1] = new Human();
	animals[2] = new Tiger();
	animals[3] = new Eagle();
	
	for (Animal a : animals) {
		a.move();
	}
}

}
