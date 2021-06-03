package controller;

import java.io.IOException;
import java.awt.image.BufferStrategy;
import java.awt.image.DataBufferInt;
import java.io.*;
import model.LogIn;

public class OsintgramController {

    public static final String OUTPUT_FILE = "output.txt";
    public static final String COMMAND = "python main.py ";
    private static final String CLIENT_ERROR = "ClientError";

    private Process process;
    private LogIn login;
    private String lastOutput;
    

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
            //pb.redirectOutput(new File(OUTPUT_FILE));
            process = pb.start();
            
            String connection = readOutput();
            if (connection.contains(CLIENT_ERROR))
                return false;
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean sendCommand(String command) {
        try {
            process.waitFor();
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
            //process.waitFor();
            BufferedReader buffer = new BufferedReader(new InputStreamReader(
                    process.getInputStream()));

            String linea;
            while ((linea = buffer.readLine()) != null) {
                cadena += linea + System.lineSeparator();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        lastOutput = cadena;
        return cadena;
    }
    
    /*
    public String readOutput2() {
        String cadena = "";
        try {
            //process.waitFor();
            BufferedReader buffer = new BufferedReader(new FileReader(new File(OUTPUT_FILE)));
            String linea;
            while ((linea = buffer.readLine()) != null) {
                cadena += linea + System.lineSeparator();
            }
            buffer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cadena;
    }
    */
    
    public String getLastOutput() {
        return lastOutput;
    }

    public void downloadImages() {
        try {
            String[] cmd = {"photos"};
            Runtime.getRuntime().exec(cmd);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }

    }

}
