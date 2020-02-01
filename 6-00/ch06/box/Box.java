package ch06.box;

public class Box {
	int w = 0;
	int h = 0;
	int l = 0;
	
	void print() {
		int res = w * h * l;
		System.out.printf("w : %dcm, h : %dcm, l : %dcm\n", w, h, l);
		System.out.println("size of box : " + res + "cm^3");
	}

}
