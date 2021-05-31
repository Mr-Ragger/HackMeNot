package controller;

import java.io.File;
import org.ini4j.*;
import model.LogIn;
import sun.security.util.Debug;
import view.LogInWindow;

public class LogInController {
	/* Credentials.ini format
	[Credentials]
	username =  
	password = 
	*/
	private File file;
	
	public LogInController(File file){
		this.file = file;
	}
	
	public LogIn getLogin(){
		LogIn login = this.readIni();
		
		LogInWindow window = new LogInWindow(login);

		login = window.getLogin();
		
		return login;
	}
	
	//Reading the ini file 
	public LogIn readIni(){
		LogIn login = null;
		try {
			Wini ini = new Wini(file);
			String user = ini.get("Credentials", "username");
			String passw = ini.get("Credentials", "password");

			login = new LogIn(user, passw, null);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return login;
	}
	//Writing the ini file
	public boolean writeIni(LogIn login){
		try {
			Wini ini = new Wini(file);
			ini.put("Credentials", "username", login.getUsername());
			ini.put("Credentials", "password", login.getPassword());
			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return false;
	}
	

}


/////////////////////////////////////TEST CODE//////////////////////////////////////////////////////////
	
	
//Remove data from .ini file
/*
	{
		try {
			Wini ini = new Wini(new File("C:\\Users\\sdkca\\Desktop\\myinifile.ini"));

			ini.put("block_name", "property_name", "value");
			ini.put("block_name", "property_name_2", 45.6);
			ini.store();
			// To catch basically any error related to writing to the file
			// (The system cannot find the file specified)
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}*/