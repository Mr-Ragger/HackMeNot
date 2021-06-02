package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

import model.LogIn;
import sun.security.util.Debug;

public class Main {

	

	public static void main(String[] args) {
		
		File iniFile = new File("Osintgram/config/credentials.ini");
		String command = "python3 Osintgram/main.py ";
		/*
		// Obtenemos los datos de login antes de iniciar el programa
		LogInController loginController = new LogInController(iniFile);
		LogIn login = loginController.getLogin();

		if (loginController.writeIni(login)) {
			command += login.getTarget();

			OsintgramController osin = new OsintgramController(login);
			
			if(osin.start()) {
				System.out.println("Start");
				//osin.sendCommand("dir");
				System.out.println(osin.readOutput());
			} else {
				System.out.println("Error al iniciar cmd.");
			}


		} else {
			System.out.println("Error al introducir credenciales.");
		}
		*/
		

		OsintgramController osin = new OsintgramController(new LogIn("", "", "algo"));

		System.out.println("Start: " + osin.start());
		

		/*try {
			//process = Runtime.getRuntime().exec(COMMAND);//startOsintgram.start();
			ProcessBuilder pb = new ProcessBuilder("python.exe", "Osintgram\\main.py", "algo");
            pb.redirectOutput(new File("output.txt"));
            Process process = pb.start();
			while(process.isAlive()) {
				
			}
			System.out.println(process.exitValue());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}*/
	}

}
