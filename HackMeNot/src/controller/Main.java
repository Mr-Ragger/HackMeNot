package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

import model.LogIn;
import sun.security.util.Debug;

public class Main {

	

	public static void main(String[] args) {
		
		File iniFile = new File("Osintgram/config/credentials.ini");
		String[] command = {"python3", "Osintgram/main.py","anxopuntojar"};

		// Obtenemos los datos de login antes de iniciar el programa
		LogInController loginController = new LogInController(iniFile);
		LogIn login = loginController.getLogin();

		if (loginController.writeIni(login)) {
			command[2] = login.getTarget();

			Runtime rt = Runtime.getRuntime();
			
			try {
				Process p = rt.exec(command);
				

				BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
				String response = "";
				String line;
				while ((line = reader.readLine()) != null) {
					response += line+"\r\n";
				}
				reader.close();
				System.out.println(response);

			} catch (Exception e) {
				// TODO: handle exception
			}

		} else {
			System.out.println("Error al introducir credenciales.");
		}

	}

}
