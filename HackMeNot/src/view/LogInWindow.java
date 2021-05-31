package view;

import model.LogIn;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class LogInWindow {

	private JFrame frmOsintgram;
	private JTextField textField;
	private LogIn login;
	private JPasswordField pssFieldUser;
	private JTextField txtSetTarget;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInWindow window = new LogInWindow(null);
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
	public LogInWindow(LogIn loginIni) {
		login = new LogIn();
		if (loginIni != null)
			login = loginIni;
		initialize();

		textField.setText(login.getUsername());
		pssFieldUser.setText(login.getPassword());

		frmOsintgram.setVisible(true);
	}

	public LogIn getLogin() {
		return login;
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
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				login.setUsername(textField.getText());
				login.setPassword(pssFieldUser.getText());
				login.setTarget(txtSetTarget.getText());

				frmOsintgram.dispose();
			}
		});
		btnLogIn.setBounds(90, 254, 89, 23);
		panel.add(btnLogIn);
		
		pssFieldUser = new JPasswordField();
		pssFieldUser.setBounds(10, 98, 256, 20);
		panel.add(pssFieldUser);
		
		JLabel lblSetTarget = new JLabel("Insert the target username:");
		lblSetTarget.setBounds(10, 129, 256, 14);
		panel.add(lblSetTarget);
		
		txtSetTarget = new JTextField();
		txtSetTarget.setBounds(10, 154, 256, 20);
		panel.add(txtSetTarget);
		txtSetTarget.setColumns(10);
		
		JLabel lblLoginSign = new JLabel("Instagram Log In");
		lblLoginSign.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginSign.setBounds(151, 48, 276, 14);
		frmOsintgram.getContentPane().add(lblLoginSign);
	}
}
