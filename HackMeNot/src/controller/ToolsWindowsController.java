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
	public void downloadImages() throws IOException {
		osint.sendCommand("photos\n");
	}

	

	public void downloadProPic() {
		osint.sendCommand("propic\n");
	}

	public void seeFollowersMails() {

		osint.sendCommand("fwersemail\n");
		 JOptionPane.showMessageDialog(null, osint.getLastOutput(),
                 "Followers Emails", JOptionPane.PLAIN_MESSAGE);

	}

	public void seeFollowingMails() {

		osint.sendCommand("fwingsemail\n");

	}

}