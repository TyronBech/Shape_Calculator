package shapes;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import main.Center_Panel_class;

public class Triangle extends Parent {
	/*
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
	*/
	public static void equilateral(JFrame frame, JPanel panel) {
		String image = "C:\\Users\\tyron\\OneDrive\\Desktop\\Java\\Shape Calculator\\Shape_Calculator\\src\\images\\equilateral.png";
		Center_Panel_class equilateral_panel = null;
		try {
			equilateral_panel = new Center_Panel_class(frame, panel, image);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void right(JFrame frame, JPanel panel) {
		String image = "C:\\Users\\tyron\\OneDrive\\Desktop\\Java\\Shape Calculator\\Shape_Calculator\\src\\images\\right.png";
		Center_Panel_class right_panel = null;
		try {
			right_panel = new Center_Panel_class(frame, panel, image);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void scalene(JFrame frame, JPanel panel) {
		String image = "C:\\Users\\tyron\\OneDrive\\Desktop\\Java\\Shape Calculator\\Shape_Calculator\\src\\images\\scalene.png";
		Center_Panel_class scalene_panel = null;
		try {
			scalene_panel = new Center_Panel_class(frame, panel, image);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
