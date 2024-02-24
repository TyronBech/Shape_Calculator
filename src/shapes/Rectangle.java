package shapes;

public class Rectangle extends Parent {
	public Rectangle(final double length){
		super.area = length * length;
	}
	public Rectangle(final double length, final double width) {
		super.area = length * width;
	}
	public double Area() {
		return super.area;
	}
}
