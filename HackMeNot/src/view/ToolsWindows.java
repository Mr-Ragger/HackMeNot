package view;

import controller.OsintgramController;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JTree;

import controller.ToolsWindowsController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ToolsWindows {

	private JFrame frmOsintgram;
	private OsintgramController osint;
	private ToolsWindowsController tools;

	/**
	 * Create the application.
	 */
	public ToolsWindows(OsintgramController osint) {
		this.osint = osint;
		this.tools = new ToolsWindowsController(osint);
		initialize();
		frmOsintgram.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOsintgram = new JFrame();
		frmOsintgram.setTitle("Osintgram");
		frmOsintgram.setResizable(false);
		frmOsintgram.setBounds(100, 100, 711, 541);
		frmOsintgram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOsintgram.getContentPane().setLayout(null);

		JPanel userInfoPanel = new JPanel();
		userInfoPanel.setBounds(10, 11, 248, 476);
		frmOsintgram.getContentPane().add(userInfoPanel);
		userInfoPanel.setLayout(null);

		JLabel userInfoTitleLabel = new JLabel("User Information");
		userInfoTitleLabel.setBounds(10, 11, 205, 14);
		userInfoPanel.add(userInfoTitleLabel);

		JScrollPane userInfoScrollPanel = new JScrollPane();
		userInfoScrollPanel.setBounds(10, 36, 228, 429);
		userInfoPanel.add(userInfoScrollPanel);

		JTextArea txtUserInfo = new JTextArea();
		txtUserInfo.setTabSize(7);
		txtUserInfo.setWrapStyleWord(true);
		txtUserInfo.setEditable(false);
		txtUserInfo.setLineWrap(true);
		userInfoScrollPanel.setViewportView(txtUserInfo);

		txtUserInfo.setForeground(Color.WHITE);
		txtUserInfo.setBackground(Color.BLACK);
		
		txtUserInfo.setText("User: anxopuntojar\nID: anxo.jar\nFull Name: Angel Rodriguez\nBiography: What im supposed to do here\nFollowers: 213\nFollowing: 367");
//		try {
//			txtUserInfo.setText(tools.getUserInfo());
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}

		JPanel userOptionsPanel = new JPanel();
		userOptionsPanel.setBounds(268, 11, 427, 476);
		frmOsintgram.getContentPane().add(userOptionsPanel);
		userOptionsPanel.setLayout(null);

		JLabel userControllsLabel = new JLabel("Target Options");
		userControllsLabel.setBounds(10, 11, 128, 14);
		userOptionsPanel.add(userControllsLabel);

		JButton btnDownloadImages = new JButton("Download All Images");
		btnDownloadImages.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					tools.downloadImages();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

		btnDownloadImages.setBounds(10, 36, 192, 49);
		userOptionsPanel.add(btnDownloadImages);

		JButton btnDownloadPFP = new JButton("Download Profile Picture");
		btnDownloadPFP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				tools.downloadProPic();
			}
		});
		btnDownloadPFP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tools.downloadProPic();
			}
		});
		btnDownloadPFP.setBounds(212, 36, 205, 49);
		userOptionsPanel.add(btnDownloadPFP);

		JButton btnShowComments = new JButton("Show All Coments");
		btnShowComments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				tools.showAllComments();
			}
		});
		btnShowComments.setBounds(10, 96, 192, 49);
		userOptionsPanel.add(btnShowComments);

		JButton btnShowAllTagged = new JButton("Show All Tagged Pics");
		btnShowAllTagged.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				tools.showAllTagged();

			}
		});
		btnShowAllTagged.setBounds(212, 96, 205, 49);
		userOptionsPanel.add(btnShowAllTagged);

		JButton btnShowAllFollowing = new JButton("Show All People Followed By Target");
		btnShowAllFollowing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				tools.seeAllFollowing();

			}
		});
		btnShowAllFollowing.setBounds(10, 156, 407, 49);
		userOptionsPanel.add(btnShowAllFollowing);

		JButton btnShowFollowedEmail = new JButton("Show Email");
		btnShowFollowedEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tools.seeFollowingMails();
			}
		});
		btnShowFollowedEmail.setToolTipText("Show email from followed people");
		btnShowFollowedEmail.setBounds(10, 216, 192, 49);
		userOptionsPanel.add(btnShowFollowedEmail);

		JButton btnShowPhoneFromFollowed = new JButton("Show Phone");
		btnShowPhoneFromFollowed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnShowPhoneFromFollowed.setToolTipText("show phone number");
		btnShowPhoneFromFollowed.setBounds(212, 216, 205, 49);
		userOptionsPanel.add(btnShowPhoneFromFollowed);

		JButton btnNewButton = new JButton("Show All People Following Target");
		btnNewButton.setBounds(10, 276, 407, 49);
		userOptionsPanel.add(btnNewButton);

		JButton btnShowEmailFollowing = new JButton("Show Email");
		btnShowEmailFollowing.setBounds(10, 336, 192, 49);
		userOptionsPanel.add(btnShowEmailFollowing);

		JButton btnShowPhoneFromFollowing = new JButton("Show Phone");
		btnShowPhoneFromFollowing.setToolTipText("show phone number");
		btnShowPhoneFromFollowing.setBounds(212, 336, 205, 49);
		userOptionsPanel.add(btnShowPhoneFromFollowing);
	}
}
