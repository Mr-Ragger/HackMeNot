package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class LogInWindow {

	private JFrame frmOsintgram;
	private JTextField textField;
	private JTextField txtSavePassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInWindow window = new LogInWindow();
					window.frmOsintgram.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogInWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOsintgram = new JFrame();
		frmOsintgram.setTitle("Osintgram");
		frmOsintgram.setResizable(false);
		frmOsintgram.setBounds(100, 100, 578, 468);
		frmOsintgram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOsintgram.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(151, 73, 276, 301);
		frmOsintgram.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setToolTipText("Insert your ig username.");
		textField.setBounds(10, 42, 256, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblSaveUser = new JLabel("Insert your username:");
		lblSaveUser.setBounds(10, 11, 256, 20);
		panel.add(lblSaveUser);
		
		JLabel lblSavePassword = new JLabel("Insert your password:");
		lblSavePassword.setBounds(10, 73, 256, 14);
		panel.add(lblSavePassword);
		
		txtSavePassword = new JTextField();
		txtSavePassword.setBounds(10, 98, 256, 20);
		panel.add(txtSavePassword);
		txtSavePassword.setColumns(10);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setBounds(90, 254, 89, 23);
		panel.add(btnLogIn);
		
		JLabel lblLoginSign = new JLabel("Instagram Log In");
		lblLoginSign.setBounds(242, 48, 90, 14);
		frmOsintgram.getContentPane().add(lblLoginSign);
	}
}
