package shapes;
import main.Center_Layout;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.Math;
import java.text.DecimalFormat;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Circle extends Parent implements ActionListener {
	String circle_file = "C:\\Users\\tyron\\OneDrive\\Desktop\\Java\\Shape Calculator\\Shape_Calculator\\src\\images\\circle.png";
	private JButton submit_Button;
	private JTextField radius_input;
	private Center_Layout new_panel;
	private JLabel result;
	private boolean is_present = false;
	public Circle(JFrame frame, JPanel panel) throws IOException {
		new_panel = new Center_Layout(
				frame, panel, resizer(circle_file, 250, 250));
		radius_input = new JTextField();
		JLabel radius_label = new JLabel("r:");
		JLabel space_label = new JLabel();
		JLabel space_result = new JLabel();
		submit_Button = new JButton("Submit");
		submit_Button.setFocusable(false);
		radius_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		radius_input.setFont(new Font("Consolas", Font.ROMAN_BASELINE, 20));
		radius_input.setPreferredSize(new Dimension(250, 40));
		space_label.setPreferredSize(new Dimension(1000, 100));
		space_result.setPreferredSize(new Dimension(2000, 80));
		new_panel.Input_Panel.add(space_label);
		new_panel.Input_Panel.add(radius_label);
		new_panel.Input_Panel.add(radius_input);
		new_panel.Input_Panel.add(submit_Button);
		new_panel.Result_Panel.add(space_result);
		submit_Button.addActionListener(this);
	}
	public Circle(final double a, final double b) {
		super.area = super.PI * a * b;
	}
	public double Area() {
		return super.area;
	}
	public Image resizer(String file, int width, int height) throws IOException {
		BufferedImage resized_shape = ImageIO.read(new File(file));
		return resized_shape.getScaledInstance(width, height, Image.SCALE_SMOOTH);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == submit_Button) {
			String input_string = radius_input.getText();
			try {
				if(input_string.isEmpty()) {
					throw new IOException("Input cannot be \"NULL\".");
				} else {
					double radius = Double.parseDouble(input_string);
					if(radius <= 0) {
						throw new ArithmeticException("Value should be positive.");
					}
					if(is_present) {
						this.area = super.PI * Math.pow(radius, 2);
						DecimalFormat for_radius = new DecimalFormat("0.00");
						new_panel.Result_Panel.remove(result);
						new_panel.Result_Panel.revalidate();
						new_panel.Result_Panel.repaint();
						result = new JLabel(for_radius.format(this.area));
						result.setFont(new Font("Times New Roman", Font.BOLD, 30));
						new_panel.Result_Panel.add(result, BorderLayout.CENTER);
						new_panel.ref_frame.setVisible(true);
					} else {			
						this.area = super.PI * Math.pow(radius, 2);
						DecimalFormat for_radius = new DecimalFormat("0.00");
						result = new JLabel("A = " + for_radius.format(this.area));
						result.setFont(new Font("Times New Roman", Font.BOLD, 30));
						new_panel.Result_Panel.add(result, BorderLayout.CENTER);
						new_panel.ref_frame.setVisible(true);
						is_present = true;
					}
				}
			} catch(NumberFormatException e1) {
				JOptionPane.showMessageDialog(null, "Input should not have non-numeric characters.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
				if(is_present) {
					new_panel.Result_Panel.remove(result);
					new_panel.Result_Panel.revalidate();
					new_panel.Result_Panel.repaint();
				}
			} catch(IOException e2) {
				JOptionPane.showMessageDialog(null, e2.getMessage(), "Invalid Input", JOptionPane.WARNING_MESSAGE);
				if(is_present) {
					new_panel.Result_Panel.remove(result);
					new_panel.Result_Panel.revalidate();
					new_panel.Result_Panel.repaint();
				}
			} catch(ArithmeticException e3){
				JOptionPane.showMessageDialog(null, e3.getMessage(), "Invalid Input", JOptionPane.WARNING_MESSAGE);
				if(is_present) {
					new_panel.Result_Panel.remove(result);
					new_panel.Result_Panel.revalidate();
					new_panel.Result_Panel.repaint();
				}
			}
		}
	}
}
