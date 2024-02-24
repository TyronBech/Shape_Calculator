package shapes;

public class Triangle extends Parent {
	public Triangle(final double base, final double height) {
		super.area = super.half * base * height;
	}
	public Triangle(final double side) {
		super.area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
	}
	public Triangle(final double a, final double b, final double c) {
		final double s = (a + b + c) / 2;
		super.area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
	public double Area() {
		return super.area;
	}
}
