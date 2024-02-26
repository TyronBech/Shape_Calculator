package shapes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.Center_Panel_class;

public class Circle extends Parent {
	public static void circle(JFrame frame, JPanel panel){
		String image = "C:\\Users\\tyron\\OneDrive\\Desktop\\Java\\Shape Calculator\\Shape_Calculator\\src\\images\\circle.png";
		Center_Panel_class circle_panel = null;
		try {
			circle_panel = new Center_Panel_class(frame, panel, image);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JLabel radius_label = new JLabel("r:");
		circle_panel.Input_panel.add(radius_label);
		JTextField radius = new JTextField();
		radius.setPreferredSize(new Dimension(300, 40));
		circle_panel.Input_panel.add(radius);
		
		frame.setVisible(true);
	}
	public static void oval(JFrame frame, JPanel panel){
		String image = "C:\\Users\\tyron\\OneDrive\\Desktop\\Java\\Shape Calculator\\Shape_Calculator\\src\\images\\oval.png";
		Center_Panel_class oval_panel = null;
		try {
			oval_panel = new Center_Panel_class(frame, panel, image);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
