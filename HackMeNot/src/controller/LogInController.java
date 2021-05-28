package controller;

import java.io.File;

import javax.swing.DebugGraphics;

import org.ini4j.*;

import view.LogInWindow;
public class LogInController {
	{
//Read from .ini files
		try {
			Wini ini = new Wini(new File("C:\\Users\\sdkca\\Desktop\\myinifile.ini"));
			int age = ini.get("owner", "age", int.class);
			double height = ini.get("owner", "height", double.class);
			String server = ini.get("database", "server");

			System.out.print("Age: " + age + "\n");
			System.out.print("Geight: " + height + "\n");
			System.out.print("Server IP: " + server + "\n");
			// To catch basically any error related to finding the file e.g
			// (The system cannot find the file specified)
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

//Writing data to .ini files
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
//Remove data from .ini file

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
	}

}
