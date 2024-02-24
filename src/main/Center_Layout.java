package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Center_Layout {
	// adding another set of panels in the center panel
	public JPanel Image_Panel = new JPanel();
	public JPanel Input_Panel = new JPanel();
	public JPanel Result_Panel = new JPanel();
	public JFrame ref_frame;
	public Center_Layout(JFrame frame, JPanel panel, Image image){
		ref_frame = frame;
		frame.remove(panel);
		frame.revalidate();
		frame.repaint();
		panel = new JPanel();
		panel.setBackground(new Color(0xC3DBD9));
		panel.setPreferredSize(new Dimension(100, 100));
		frame.add(panel, BorderLayout.CENTER);
		// setting the color of the panels
		Image_Panel.setBackground(new Color(0xC3DBD9));
		Input_Panel.setBackground(new Color(0xC3DBD9));
		Result_Panel.setBackground(new Color(0xC3DBD9));
		panel.revalidate();
		panel.repaint();
		// adjusting the dimensions of the panels
		Image_Panel.setPreferredSize(new Dimension(270, 270));
		Input_Panel.setPreferredSize(new Dimension(20, 50));
		Result_Panel.setPreferredSize(new Dimension(100, 220));
		Input_Panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel.setLayout(new BorderLayout());
		// setting the border layout for the panels
		panel.add(Image_Panel, BorderLayout.WEST);
		panel.add(Input_Panel, BorderLayout.CENTER);
		panel.add(Result_Panel, BorderLayout.SOUTH);
		// adding image into the panel
		Border border = BorderFactory.createLineBorder(Color.GRAY, 3);
		JLabel image_label = new JLabel(new ImageIcon(image));
		image_label.setBorder(border);
		Image_Panel.add(image_label);
	}
}
