package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

import model.LogIn;

public class Main {

    public static void main(String[] args) {

        File iniFile = new File("config/credentials.ini");

        // Obtenemos los datos de login antes de iniciar el programa
        LogInController loginController = new LogInController(iniFile);
        LogIn login = loginController.getLogin();

        if (loginController.writeIni(login)) {
            OsintgramController osin = new OsintgramController(login);

            if (osin.start()) {
                System.out.println("Start");
                System.out.println(osin.getLastOutput());
            } else {
                System.out.println("Error al iniciar osintgram.");
                JOptionPane.showMessageDialog(null, osin.getLastOutput(),
                    "Loging Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            System.out.println("Error al introducir credenciales.");
        }


        /*
        OsintgramController osin = new OsintgramController(new LogIn("", "", "algo"));

        System.out.println("Start: " + osin.start());

        System.out.println(osin.getLastOutput());
         */
    }

}
