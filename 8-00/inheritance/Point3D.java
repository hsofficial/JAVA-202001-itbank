package ch08.inheritance;

public class Point3D extends Point {
	int z;

	public Point3D() {
		this(100, 200, 300);	// �ٸ� ������ ȣ��
	}

	public Point3D(int x, int y, int z) {
		super(x, y);	// �θ��� ������ ȣ��, ��� ���� �ʱ�ȭ
		this.z = z;
	}	
}
