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

public class Triangle extends Parent {
	private static Center_Panel_class input_panel = null;
	public static void equilateral(JFrame frame, JPanel panel) {
		String image = "C:\\Users\\tyron\\OneDrive\\Desktop\\Java\\Shape Calculator\\Shape_Calculator\\src\\images\\equilateral.png";
		try {
			input_panel = new Center_Panel_class(frame, panel, image, 90);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JLabel radius_label = new JLabel("a:");
		radius_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		JTextField a = new JTextField();
		a.setFont(new Font("Arial", Font.ROMAN_BASELINE, 20));
		a.setPreferredSize(new Dimension(300, 40));
		JPanel radius_panel = new JPanel();
		radius_panel.setBackground(new Color(0xF6F193));
		JButton submit_button = new JButton("Submit");
		submit_button.setFocusable(false);
		radius_panel.add(radius_label);
		radius_panel.add(a);
		input_panel.Input_panel.add(radius_panel);
		input_panel.Input_panel.add(submit_button);
		submit_button.addActionListener(e -> compute_equilateral(a.getText()));
		frame.setVisible(true);
	}
	public static void right(JFrame frame, JPanel panel) {
		String image = "C:\\Users\\tyron\\OneDrive\\Desktop\\Java\\Shape Calculator\\Shape_Calculator\\src\\images\\right.png";
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
		submit_button.addActionListener(e -> compute_right(a.getText(), b.getText()));
		frame.setVisible(true);
	}
	
	public static void scalene(JFrame frame, JPanel panel) {
		String image = "C:\\Users\\tyron\\OneDrive\\Desktop\\Java\\Shape Calculator\\Shape_Calculator\\src\\images\\scalene.png";
		try {
			input_panel = new Center_Panel_class(frame, panel, image, 30);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JPanel aPanel = new JPanel();
		JPanel bPanel = new JPanel();
		JPanel cPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		aPanel.setBackground(new Color(0xF6F193));
		bPanel.setBackground(new Color(0xF6F193));
		cPanel.setBackground(new Color(0xF6F193));
		buttonPanel.setBackground(new Color(0xF6F193));
		buttonPanel.setPreferredSize(new Dimension(500, 40));
		JLabel a_label = new JLabel("a:");
		JLabel b_label = new JLabel("b:");
		JLabel c_label = new JLabel("c:");
		a_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		c_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		JTextField a = new JTextField();
		JTextField b = new JTextField();
		JTextField c = new JTextField();
		a.setFont(new Font("Arial", Font.ROMAN_BASELINE, 20));
		b.setFont(new Font("Arial", Font.ROMAN_BASELINE, 20));
		c.setFont(new Font("Arial", Font.ROMAN_BASELINE, 20));
		a.setPreferredSize(new Dimension(300, 40));
		b.setPreferredSize(new Dimension(300, 40));
		c.setPreferredSize(new Dimension(300, 40));
		aPanel.add(a_label);
		bPanel.add(b_label);
		cPanel.add(c_label);
		JButton submit_button = new JButton("Submit");
		submit_button.setFocusable(false);
		aPanel.add(a);
		bPanel.add(b);
		cPanel.add(c);
		buttonPanel.add(submit_button);
		input_panel.Input_panel.add(aPanel);
		input_panel.Input_panel.add(bPanel);
		input_panel.Input_panel.add(cPanel);
		input_panel.Input_panel.add(buttonPanel);
		submit_button.addActionListener(e -> compute_scalene(a.getText(), b.getText(), c.getText()));
		frame.setVisible(true);
	}
	private static void compute_equilateral(String a) {
		try {
			if(a.isEmpty()) {
				throw new IOException();
			} else {
				double parsed_a = Double.parseDouble(a);
				if(parsed_a <= 0) {
					throw new ArithmeticException();
				} else {
					Parent.area = (Math.sqrt(3) / 4) * Math.pow(parsed_a, 2);
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
	private static void compute_right(String a, String b) {
		try {
			if(a.isEmpty() || b.isEmpty()) {
				throw new IOException();
			} else {
				double parsed_a = Double.parseDouble(a);
				double parsed_b = Double.parseDouble(b);
				if(parsed_a <= 0 || parsed_b <= 0) {
					throw new ArithmeticException();
				} else {
					Parent.area = Parent.half * parsed_a * parsed_b;
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
	private static void compute_scalene(String a, String b, String c) {
		try {
			if(a.isEmpty() || b.isEmpty() || c.isEmpty()) {
				throw new IOException();
			} else {
				double parsed_a = Double.parseDouble(a);
				double parsed_b = Double.parseDouble(b);
				double parsed_c = Double.parseDouble(c);
				if(parsed_a <= 0 || parsed_b <= 0 || parsed_c <= 0) {
					throw new ArithmeticException();
				} else {
					final double s = (parsed_a + parsed_b + parsed_c) / 2;
					Parent.area = Math.sqrt(s * (s - parsed_a) * (s - parsed_b) * (s - parsed_c));
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
