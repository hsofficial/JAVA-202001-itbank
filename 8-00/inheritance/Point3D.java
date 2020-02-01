package ch08.inheritance;

public class Point3D extends Point {
	int z;

	public Point3D() {
		this(100, 200, 300);	// 다른 생성자 호출
	}

	public Point3D(int x, int y, int z) {
		super(x, y);	// 부모의 생성자 호출, 멤버 변수 초기화
		this.z = z;
	}	
}
