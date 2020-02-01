package ch06.reference.test2;

public class ManTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man man1 = new Man();
		
		man1.old = 40;
		man1.name = "dlwlrma";
		man1.marry = true;
		man1.childNum = 3;
		
		man1.info();
		
		Man man2 = new Man(44, "tom");
		
		man2.marry = false;
		man2.childNum = 0;
		
		man2.info();
	}

}
