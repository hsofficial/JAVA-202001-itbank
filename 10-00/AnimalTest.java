package ch10;

import java.util.ArrayList;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> alist = new ArrayList<Animal>();
		alist.add(new Lion());
		alist.add(new Goldfish());
		alist.add(new Eagle());
		
		for(int i = 0; i<alist.size(); i++) {
			Animal a = alist.get(i);
			a.move();
			a.shape();
			
			if(a instanceof Lion) {
				Lion l = (Lion) a;
				l.hunting();
			}
			else if(a instanceof Goldfish) {
				Goldfish g = (Goldfish) a;
				g.swimming();
			}
			else if(a instanceof Eagle) {
				Eagle e = (Eagle) a;
				e.flying();
			}
			else {
				System.out.println("error");
			}
			
			System.out.println();
		}
	}

}
