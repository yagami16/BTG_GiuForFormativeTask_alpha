package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

//GUI

public class failLol {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					failLol window = new failLol();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public failLol() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 301, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 266, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton NMBR1 = new JButton("1");
		NMBR1.setFont(new Font("Tahoma", Font.BOLD, 12));
		NMBR1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+NMBR1.getText();
				textField.setText(number);
			}
		});
		NMBR1.setBounds(10, 72, 58, 35);
		frame.getContentPane().add(NMBR1);
		
		JButton NMBR4 = new JButton("4");
		NMBR4.setFont(new Font("Tahoma", Font.BOLD, 12));
		NMBR4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+NMBR4.getText();
				textField.setText(number);
			}
		});
		NMBR4.setBounds(10, 115, 58, 35);
		frame.getContentPane().add(NMBR4);
		
		JButton NMBR7 = new JButton("7");
		NMBR7.setFont(new Font("Tahoma", Font.BOLD, 12));
		NMBR7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+NMBR7.getText();
				textField.setText(number);
			}
		});
		NMBR7.setBounds(10, 161, 58, 35);
		frame.getContentPane().add(NMBR7);
		
		JButton Yah = new JButton("Yes");
		Yah.setFont(new Font("Tahoma", Font.BOLD, 12));
		Yah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+Yah.getText();
				textField.setText(number);
			}
		});
		Yah.setBounds(10, 215, 58, 35);
		frame.getContentPane().add(Yah);
		
		JButton NMBR2 = new JButton("2");
		NMBR2.setFont(new Font("Tahoma", Font.BOLD, 12));
		NMBR2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+NMBR2.getText();
				textField.setText(number);
			}
		});
		NMBR2.setBounds(79, 72, 58, 35);
		frame.getContentPane().add(NMBR2);
		
		JButton NMBR5 = new JButton("5");
		NMBR5.setFont(new Font("Tahoma", Font.BOLD, 12));
		NMBR5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+NMBR5.getText();
				textField.setText(number);
			}
		});
		NMBR5.setBounds(79, 115, 58, 35);
		frame.getContentPane().add(NMBR5);
		
		JButton NMBR8 = new JButton("8");
		NMBR8.setFont(new Font("Tahoma", Font.BOLD, 12));
		NMBR8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+NMBR8.getText();
				textField.setText(number);
			}
		});
		NMBR8.setBounds(78, 161, 58, 35);
		frame.getContentPane().add(NMBR8);
		
		JButton NMBR0 = new JButton("0");
		NMBR0.setFont(new Font("Tahoma", Font.BOLD, 12));
		NMBR0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+NMBR0.getText();
				textField.setText(number);
			}
		});
		NMBR0.setBounds(79, 215, 58, 35);
		frame.getContentPane().add(NMBR0);
		
		JButton NMBR3 = new JButton("3");
		NMBR3.setFont(new Font("Tahoma", Font.BOLD, 12));
		NMBR3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+NMBR3.getText();
				textField.setText(number);
				}
		});
		NMBR3.setBounds(150, 72, 58, 35);
		frame.getContentPane().add(NMBR3);
		
		JButton NMBR6 = new JButton("6");
		NMBR6.setFont(new Font("Tahoma", Font.BOLD, 12));
		NMBR6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+NMBR6.getText();
				textField.setText(number);
			}
		});
		NMBR6.setBounds(150, 115, 58, 35);
		frame.getContentPane().add(NMBR6);
		
		JButton NMBR9 = new JButton("9");
		NMBR9.setFont(new Font("Tahoma", Font.BOLD, 12));
		NMBR9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+NMBR9.getText();
				textField.setText(number);
			}
		});
		NMBR9.setBounds(150, 161, 58, 35);
		frame.getContentPane().add(NMBR9);
		
		JButton Nah = new JButton("No");
		Nah.setFont(new Font("Tahoma", Font.BOLD, 12));
		Nah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+Nah.getText();
				textField.setText(number);
			}
		});
		Nah.setBounds(150, 215, 58, 35);
		frame.getContentPane().add(Nah);
		
		JButton btnEnter = new JButton("\u21A9");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEnter.setBounds(218, 215, 58, 35);
		frame.getContentPane().add(btnEnter);
		
		JButton button_Bckspc = new JButton("\u2190 ");
		button_Bckspc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Bckspc=null;
				if (textField.getText().length()>0)
				{
					StringBuilder string= new StringBuilder(textField.getText());
					string.deleteCharAt(textField.getText().length()-1);
					Bckspc=string.toString();
					textField.setText(Bckspc);
				}
			}
		});
		button_Bckspc.setBounds(218, 72, 58, 35);
		frame.getContentPane().add(button_Bckspc);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBounds(218, 115, 58, 35);
		frame.getContentPane().add(btnC);
		
		JButton button_comma = new JButton(".");
		button_comma.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_comma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+button_comma.getText();
				textField.setText(number);
			}
		});
		button_comma.setBounds(218, 161, 58, 35);
		frame.getContentPane().add(button_comma);
	}
}
