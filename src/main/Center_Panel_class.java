package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Center_Panel_class {
	public JPanel Input_panel = null;
	public JPanel Output_panel = null;
	public JFrame ref_frame = null;
	public Center_Panel_class(JFrame frame, JPanel panel, String image, int vgap) throws IOException{
		if(panel.getComponentCount() > 0) {
			panel.removeAll();
			panel.revalidate();
			panel.repaint();
		}
		ref_frame = frame;
		JPanel Image_panel = new JPanel();
		Input_panel = new JPanel();
		Output_panel = new JPanel();
		JLabel space_label = new JLabel();
		space_label.setPreferredSize(new Dimension(1000, vgap));
		Image_panel.setBackground(new Color(0xC5EBAA));
		Input_panel.setBackground(new Color(0xF6F193));
		Output_panel.setBackground(new Color(0xF2C18D));
		Image_panel.setPreferredSize(new Dimension(275, 275));
		Input_panel.setPreferredSize(new Dimension(100, 100));
		Output_panel.setPreferredSize(new Dimension(100, 225));
		panel.setLayout(new BorderLayout());
		panel.add(Image_panel, BorderLayout.WEST);
		panel.add(Input_panel, BorderLayout.CENTER);
		panel.add(Output_panel, BorderLayout.SOUTH);
		Input_panel.add(space_label);
		JLabel Image_label = new JLabel(
				new ImageIcon(resizer(image, 250, 250)));
		Image_label.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		Image_panel.add(Image_label, BorderLayout.CENTER);
		frame.setVisible(true);
	}
	private Image resizer(String file, int width, int height) throws IOException {
		BufferedImage resized_shape = ImageIO.read(new File(file));
		return resized_shape.getScaledInstance(width, height, Image.SCALE_SMOOTH);
	}
}
