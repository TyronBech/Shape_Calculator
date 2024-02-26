package shapes;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import main.Center_Panel_class;

public class Trapezoid extends Parent {
	/*
	public Trapezoid(final double a, final double b, final double h) {
		super.area = ((a + b) / 2) * h;
	}
	public double Area() {
		return super.area;
	}
	*/
	public static void trapezoid(JFrame frame, JPanel panel) {
		String image = "C:\\Users\\tyron\\OneDrive\\Desktop\\Java\\Shape Calculator\\Shape_Calculator\\src\\images\\trapezoid.png";
		Center_Panel_class trapezoid_panel = null;
		try {
			trapezoid_panel = new Center_Panel_class(frame, panel, image, 0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
