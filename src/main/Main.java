package main;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import shapes.Circle;

public class Main {
	public static void main(String[] args) throws IOException {
		// setup for the window
		JFrame frame = new JFrame();
		frame.setSize(1100, 650);
		frame.setTitle("Area Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// creating an instance of the panels
		JPanel Left_Panel = new JPanel();
		JPanel Center_Panel = new JPanel();
		JPanel Top_Panel = new JPanel();
		// setting a background color for the panels
		Top_Panel.setBackground(new Color(0xBB6464));
		Center_Panel.setBackground(new Color(0xC3DBD9));
		Left_Panel.setBackground(new Color(0xCDB699));
		// setting the initial dimensions of each panels
		Top_Panel.setPreferredSize(new Dimension(100, 120));
		Center_Panel.setPreferredSize(new Dimension(100, 100));
		Left_Panel.setPreferredSize(new Dimension(260, 100));
		Left_Panel.setLayout(new FlowLayout(10, 55, 15));
		// border layout set up for each panel
		frame.add(Top_Panel, BorderLayout.NORTH);
		frame.add(Center_Panel, BorderLayout.CENTER);
		frame.add(Left_Panel, BorderLayout.WEST);
		// adding the main title for the top panel
		JLabel Title = new JLabel(
				new ImageIcon(resizer(
				"C:\\Users\\tyron\\OneDrive\\Desktop\\Java\\Shape Calculator\\Shape_Calculator\\src\\images\\Main_Title.png",
				300, 100)));
		Top_Panel.add(Title, BorderLayout.CENTER);
		// adding a title for the left panel using image
		JLabel Shape_Choices = new JLabel(
				new ImageIcon(resizer(
						"C:\\Users\\tyron\\OneDrive\\Desktop\\Java\\Shape Calculator\\Shape_Calculator\\src\\images\\shapes.png",
						160, 45)));
		Left_Panel.add(Shape_Choices, BorderLayout.CENTER);
		// creating the button instance
		JButton Circle_Button = new JButton();
		JButton Oval_Button = new JButton();
		JButton Square_Button = new JButton();
		JButton Rectangle_Button = new JButton();
		JButton Triangle1_Button = new JButton();
		JButton Triangle2_Button = new JButton();
		JButton Triangle3_Button = new JButton();
		JButton Trapezoid_Button = new JButton();
		// setting the dimensions of the buttons
		final int hDimensions = 30;
		final int lDimensions = 160;
		Circle_Button.setPreferredSize(new Dimension(lDimensions, hDimensions));
		Oval_Button.setPreferredSize(new Dimension(lDimensions, hDimensions));
		Square_Button.setPreferredSize(new Dimension(lDimensions, hDimensions));
		Rectangle_Button.setPreferredSize(new Dimension(lDimensions, hDimensions));
		Triangle1_Button.setPreferredSize(new Dimension(lDimensions, hDimensions));
		Triangle2_Button.setPreferredSize(new Dimension(lDimensions, hDimensions));
		Triangle3_Button.setPreferredSize(new Dimension(lDimensions, hDimensions));
		Trapezoid_Button.setPreferredSize(new Dimension(lDimensions, hDimensions));
		// setting text to each buttons
		Circle_Button.setText("Circle");
		Oval_Button.setText("Oval");
		Square_Button.setText("Square");
		Rectangle_Button.setText("Rectangle");
		Triangle1_Button.setText("Equilateral Triangle");
		Triangle2_Button.setText("Right Triangle");
		Triangle3_Button.setText("Scalene Triangle");
		Trapezoid_Button.setText("Trapezoid");
		// set focus to false to remove the rectangular line surrounding the text
		Circle_Button.setFocusable(false);
		Oval_Button.setFocusable(false);
		Square_Button.setFocusable(false);
		Rectangle_Button.setFocusable(false);
		Triangle1_Button.setFocusable(false);
		Triangle2_Button.setFocusable(false);
		Triangle3_Button.setFocusable(false);
		Trapezoid_Button.setFocusable(false);
		// add all the created button to the left panel
		Left_Panel.add(Circle_Button);
		Left_Panel.add(Oval_Button);
		Left_Panel.add(Square_Button);
		Left_Panel.add(Rectangle_Button);
		Left_Panel.add(Triangle1_Button);
		Left_Panel.add(Triangle2_Button);
		Left_Panel.add(Triangle3_Button);
		Left_Panel.add(Trapezoid_Button);
		
		Circle_Button.addActionListener(e -> {
			try {
				new Circle(frame, Center_Panel);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});
		frame.setVisible(true);
	}
	public static Image resizer(String file, int width, int height) throws IOException {
		BufferedImage resized_shape = ImageIO.read(new File(file));
		return resized_shape.getScaledInstance(width, height, Image.SCALE_SMOOTH);
	}
}