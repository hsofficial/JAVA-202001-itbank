package ch12.object;

class Circle implements Cloneable{
	Point point;
	int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [point=" + point + ", radius=" + radius + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
