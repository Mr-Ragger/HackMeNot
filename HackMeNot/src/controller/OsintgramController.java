package controller;

import java.io.IOException;
import java.awt.image.BufferStrategy;
import java.io.*;
import model.LogIn;

public class OsintgramController {

	public static final String OUTPUT_FILE = "output.txt";
	public static final String COMMAND = "python main.py ";

	private Process process;

	private LogIn login;

	/*
	 * try { String[] cmd = { "python3", "main.py", "anxopuntojar" };
	 * Runtime.getRuntime().exec(cmd); } catch (IOException ioe) {
	 * System.out.println(ioe); }
	 */
	public OsintgramController(LogIn login) {
		this.login = login;
	}

	public boolean start() {	
		try {
			//process = Runtime.getRuntime().exec(COMMAND);//startOsintgram.start();
			ProcessBuilder pb = new ProcessBuilder("python.exe", "Osintgram\\main.py", login.getTarget());
            pb.redirectOutput(new File(OUTPUT_FILE));
            process = pb.start();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean sendCommand(String command) {
		try {
			BufferedWriter buffer = new BufferedWriter(new OutputStreamWriter(
				process.getOutputStream()));
			buffer.write(command);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public String readOutput() {
		String cadena = "";
		try {
			process.waitFor();
			BufferedReader buffer = new BufferedReader(new InputStreamReader(
				process.getInputStream()));
			String linea;
			while((linea = buffer.readLine()) != null)
				cadena += linea + System.lineSeparator();	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return cadena;
	}

	public void downloadImages() {
		try {
			String[] cmd = { "photos" };
			Runtime.getRuntime().exec(cmd);
		} catch (IOException ioe) {
			System.out.println(ioe);
		}	

	}


}
