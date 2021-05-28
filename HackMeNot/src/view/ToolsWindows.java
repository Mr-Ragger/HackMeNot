package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.JScrollPane;

public class ToolsWindows {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ToolsWindows window = new ToolsWindows();
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
	public ToolsWindows() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 711, 541);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel userInfoPanel = new JPanel();
		userInfoPanel.setBounds(33, 54, 225, 433);
		frame.getContentPane().add(userInfoPanel);
		userInfoPanel.setLayout(null);
		
		JLabel userInfoTitleLabel = new JLabel("User Information");
		userInfoTitleLabel.setBounds(10, 11, 205, 14);
		userInfoPanel.add(userInfoTitleLabel);
		
		JScrollPane userInfoScrollPanel = new JScrollPane();
		userInfoScrollPanel.setBounds(20, 36, 195, 386);
		userInfoPanel.add(userInfoScrollPanel);
		
		JTextArea txtUserInfo = new JTextArea();
		userInfoScrollPanel.setViewportView(txtUserInfo);
		txtUserInfo.setForeground(Color.WHITE);
		txtUserInfo.setBackground(Color.BLACK);
		
		JPanel userOptionsPanel = new JPanel();
		userOptionsPanel.setBounds(268, 54, 427, 433);
		frame.getContentPane().add(userOptionsPanel);
		userOptionsPanel.setLayout(null);
		
		JLabel userControllsLabel = new JLabel("Target Options");
		userControllsLabel.setBounds(10, 11, 128, 14);
		userOptionsPanel.add(userControllsLabel);
		
		JButton btnDownloadImages = new JButton("Download All Images");
		btnDownloadImages.setBounds(10, 36, 192, 49);
		userOptionsPanel.add(btnDownloadImages);
		
		JButton btnDownloadPFP = new JButton("Download Profile Picture");
		btnDownloadPFP.setBounds(212, 36, 205, 49);
		userOptionsPanel.add(btnDownloadPFP);
		
		JButton btnShowComments = new JButton("Show All Coments");
		btnShowComments.setBounds(10, 96, 192, 49);
		userOptionsPanel.add(btnShowComments);
		
		JButton btnShowAllTagged = new JButton("Show All Tagged Pics");
		btnShowAllTagged.setBounds(212, 96, 205, 49);
		userOptionsPanel.add(btnShowAllTagged);
		
		JButton btnShowAllFollowing = new JButton("Show All People Followed By Target");
		btnShowAllFollowing.setBounds(10, 156, 407, 49);
		userOptionsPanel.add(btnShowAllFollowing);
		
		JButton btnShowFollowedEmail = new JButton("Show Email");
		btnShowFollowedEmail.setToolTipText("Show email from followed people");
		btnShowFollowedEmail.setBounds(10, 216, 192, 49);
		userOptionsPanel.add(btnShowFollowedEmail);
		
		JButton btnShowDataFromFollowed = new JButton("Show Data");
		btnShowDataFromFollowed.setBounds(212, 216, 205, 49);
		userOptionsPanel.add(btnShowDataFromFollowed);
		
		JButton btnNewButton = new JButton("Show All People Following Target");
		btnNewButton.setBounds(10, 276, 407, 49);
		userOptionsPanel.add(btnNewButton);
		
		JButton btnShowEmailFollowing = new JButton("Show Email");
		btnShowEmailFollowing.setBounds(10, 336, 192, 49);
		userOptionsPanel.add(btnShowEmailFollowing);
		
		JButton btnShowDataFromFollowing = new JButton("Show Data");
		btnShowDataFromFollowing.setBounds(212, 336, 205, 49);
		userOptionsPanel.add(btnShowDataFromFollowing);
	}
}
