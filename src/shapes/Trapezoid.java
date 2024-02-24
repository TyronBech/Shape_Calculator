package shapes;

public class Trapezoid extends Parent {
	public Trapezoid(final double a, final double b, final double h) {
		super.area = ((a + b) / 2) * h;
	}
	public double Area() {
		return super.area;
	}
}
