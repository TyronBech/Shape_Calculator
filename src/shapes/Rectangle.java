package shapes;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import main.Center_Panel_class;

public class Rectangle extends Parent {
	public static void square(JFrame frame, JPanel panel) {
		String image = "C:\\Users\\tyron\\OneDrive\\Desktop\\Java\\Shape Calculator\\Shape_Calculator\\src\\images\\square.png";
		Center_Panel_class square_panel = null;
		try {
			square_panel = new Center_Panel_class(frame, panel, image);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void rectangle(JFrame frame, JPanel panel) {
		String image = "C:\\Users\\tyron\\OneDrive\\Desktop\\Java\\Shape Calculator\\Shape_Calculator\\src\\images\\rectangle.png";
		Center_Panel_class rectangle_panel = null;
		try {
			rectangle_panel = new Center_Panel_class(frame, panel, image);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
