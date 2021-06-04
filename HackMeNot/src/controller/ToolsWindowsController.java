package controller;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

import model.LogIn;

public class ToolsWindowsController {

	private OsintgramController osint;

	public ToolsWindowsController(OsintgramController osint) {
		this.osint = osint;
	}

	public String getUserInfo() throws IOException {
		// Reading data using readLine
		String userInfo = osint.readOutput();

		return userInfo;
	}

	// Download all target pictures
	public void downloadImages() throws IOException {
		osint.sendCommand("photos\n");
	}

	// Download profile picture
	public void downloadProPic() {
		osint.sendCommand("propic\n");
	}

	// Show all following users
	public void seeAllFollowing() {

		osint.sendCommand("following\n");
		JOptionPane.showMessageDialog(null, osint.getLastOutput(), "Following List", JOptionPane.PLAIN_MESSAGE);

	}

	// Show all available numbers from following users
	public void seeFollowingNumbers() {
		osint.sendCommand("fwingnumbers\n");
		JOptionPane.showMessageDialog(null, osint.getLastOutput(), "Followings Numberss", JOptionPane.PLAIN_MESSAGE);

	}

	// Show all available emails from following users
	public void seeFollowingMails() {

		osint.sendCommand("fwingemail\n");
		JOptionPane.showMessageDialog(null, osint.getLastOutput(), "Following Emails", JOptionPane.PLAIN_MESSAGE);

	}

	// Show all followers
	public void seeAllFollowers() {

		osint.sendCommand("followers\n");
		JOptionPane.showMessageDialog(null, osint.getLastOutput(), "Followers List", JOptionPane.PLAIN_MESSAGE);

	}

	// Show all available numbers from followers
	public void seeFollowersNumbers() {
		osint.sendCommand("fwrsnumber\n");
		JOptionPane.showMessageDialog(null, osint.getLastOutput(), "Followers Numberss", JOptionPane.PLAIN_MESSAGE);

	}

	// Show all available emails from followers¡
	public void seeFollowersMails() {

		osint.sendCommand("fwersemail\n");
		JOptionPane.showMessageDialog(null, osint.getLastOutput(), "Followers Emails", JOptionPane.PLAIN_MESSAGE);

	}

	


}