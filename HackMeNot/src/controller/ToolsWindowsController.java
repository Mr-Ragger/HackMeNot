package controller;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ToolsWindowsController {

	public static void downloadImages() throws IOException {

		ProcessBuilder createCMD = new ProcessBuilder();

		createCMD.command();

	
		
		
		Process process = Runtime.getRuntime().exec("lsb_release -a");
		InputStream inputstream = process.getInputStream();
		BufferedInputStream bufferedinputstream = new BufferedInputStream(inputstream);
		
		  }
			
	public static String getUserInfo() throws IOException {
		
				// Enter data using BufferReader
		        BufferedReader reader = new BufferedReader(
		            new InputStreamReader(System.in));
		 
		        // Reading data using readLine
		        String userInfo = reader.readLine();
		        
				return userInfo;
		        
		  

	}
	

}