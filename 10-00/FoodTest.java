package ch10;

public class FoodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food[] foods = new Food[2];
		
		foods[0] = new Noodle();
		foods[1] = new Kimchi();
		
		for (int i = 0; i<foods.length; i++) {
			foods[i].cook();
			foods[i].taste();
		}
	}

}
