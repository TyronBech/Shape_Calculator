package shapes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.IOException;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.Center_Panel_class;

public class Rectangle extends Parent {
	private static Center_Panel_class input_panel = null;
	public static void square(JFrame frame, JPanel panel) {
		String image = "C:\\Users\\tyron\\OneDrive\\Desktop\\Java\\Shape Calculator\\Shape_Calculator\\src\\images\\square.png";
		try {
			input_panel = new Center_Panel_class(frame, panel, image, 90);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JLabel radius_label = new JLabel("a:");
		radius_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		JTextField radius = new JTextField();
		radius.setFont(new Font("Arial", Font.ROMAN_BASELINE, 20));
		radius.setPreferredSize(new Dimension(300, 40));
		JPanel radius_panel = new JPanel();
		radius_panel.setBackground(new Color(0xF6F193));
		JButton submit_button = new JButton("Submit");
		submit_button.setFocusable(false);
		radius_panel.add(radius_label);
		radius_panel.add(radius);
		input_panel.Input_panel.add(radius_panel);
		input_panel.Input_panel.add(submit_button);
		submit_button.addActionListener(e -> compute_square(radius.getText()));
		frame.setVisible(true);
	}
	public static void rectangle(JFrame frame, JPanel panel) {
		String image = "C:\\Users\\tyron\\OneDrive\\Desktop\\Java\\Shape Calculator\\Shape_Calculator\\src\\images\\rectangle.png";
		try {
			input_panel = new Center_Panel_class(frame, panel, image, 60);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JPanel aPanel = new JPanel();
		JPanel bPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		aPanel.setBackground(new Color(0xF6F193));
		bPanel.setBackground(new Color(0xF6F193));
		buttonPanel.setBackground(new Color(0xF6F193));
		buttonPanel.setPreferredSize(new Dimension(500, 40));
		JLabel a_label = new JLabel("a:");
		JLabel b_label = new JLabel("b:");
		a_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		JTextField a = new JTextField();
		JTextField b = new JTextField();
		a.setFont(new Font("Arial", Font.ROMAN_BASELINE, 20));
		b.setFont(new Font("Arial", Font.ROMAN_BASELINE, 20));
		a.setPreferredSize(new Dimension(300, 40));
		b.setPreferredSize(new Dimension(300, 40));
		aPanel.add(a_label);
		bPanel.add(b_label);
		JButton submit_button = new JButton("Submit");
		submit_button.setFocusable(false);
		aPanel.add(a);
		bPanel.add(b);
		buttonPanel.add(submit_button);
		input_panel.Input_panel.add(aPanel);
		input_panel.Input_panel.add(bPanel);
		input_panel.Input_panel.add(buttonPanel);
		submit_button.addActionListener(e -> compute_rectangle(a.getText(), b.getText()));
		frame.setVisible(true);
	}
	private static void compute_square(String side) {
		try {
			if(side.isEmpty()) {
				throw new IOException();
			} else {
				double parsedSide = Double.parseDouble(side);
				if(parsedSide <= 0) {
					throw new ArithmeticException();
				} else {
					Parent.area = Math.pow(parsedSide, 2);
					DecimalFormat format_result = new DecimalFormat("0.00");
					String strResult = format_result.format(Parent.area);
					Output(strResult);
				}
			}
		} catch(IOException e1) {
			JOptionPane.showMessageDialog(null, "Input should not be empty", "Error", JOptionPane.WARNING_MESSAGE);
			remove_panel();
		} catch(NumberFormatException e2) {
			JOptionPane.showMessageDialog(null, "Cannot input non-numeric type characters", "Error", JOptionPane.WARNING_MESSAGE);
			remove_panel();
		} catch(ArithmeticException e3) {
			JOptionPane.showMessageDialog(null, "Cannot input 0 or negative numbers", "Error", JOptionPane.WARNING_MESSAGE);
			remove_panel();
		}
	}
	private static void compute_rectangle(String a, String b) {
		try {
			if(a.isEmpty() || b.isEmpty()) {
				throw new IOException();
			} else {
				double parsed_a = Double.parseDouble(a);
				double parsed_b = Double.parseDouble(b);
				if(parsed_a <= 0 || parsed_b <= 0) {
					throw new ArithmeticException();
				} else {
					Parent.area = parsed_a * parsed_b;
					DecimalFormat format_result = new DecimalFormat("0.00");
					String strResult = format_result.format(Parent.area);
					Output(strResult);
				}
			}
		} catch(IOException e1) {
			JOptionPane.showMessageDialog(null, "Input should not be empty", "Error", JOptionPane.WARNING_MESSAGE);
			remove_panel();
		} catch(NumberFormatException e2) {
			JOptionPane.showMessageDialog(null, "Cannot input non-numeric type characters", "Error", JOptionPane.WARNING_MESSAGE);
			remove_panel();
		} catch(ArithmeticException e3) {
			JOptionPane.showMessageDialog(null, "Cannot input 0 or negative numbers", "Error", JOptionPane.WARNING_MESSAGE);
			remove_panel();
		}
	}
	private static void Output(String result) {
		remove_panel();
		JLabel output_label = new JLabel(result);
		JLabel space_label = new JLabel();
		space_label.setPreferredSize(new Dimension(1000, 75));
		output_label.setFont(new Font("Times New Roman", Font.BOLD, 40));
		output_label.setBackground(new Color(0xF2C18D));
		input_panel.Output_panel.add(space_label);
		input_panel.Output_panel.add(output_label);
		input_panel.ref_frame.setVisible(true);
	}
	private static void remove_panel() {
		if(input_panel.Output_panel.getComponentCount() > 0) {
			input_panel.Output_panel.removeAll();
			input_panel.Output_panel.revalidate();
			input_panel.Output_panel.repaint();
		}
	}
}
