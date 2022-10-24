package login.Client;

import java.io.*;
import java.net.Socket;

public class Login {


    public static void main(String[] args) {
        String host = "localhost";
        int port = 9999;

        String usuari, contrassenya;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Introdueix usuari: ");
            usuari = br.readLine();
            System.out.print("\nIntrodueix la contrassenya: ");
            contrassenya = br.readLine();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        }

        try {

            Socket socket = new Socket(host, port);
            //Envia les dades
            try (BufferedWriter escriptor = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream()))) {
                escriptor.write(usuari);
                escriptor.newLine();
                escriptor.write(contrassenya);
                escriptor.newLine();
                escriptor.flush();
                // Obté el resultat del servidor i l'imprimeix
                try (BufferedReader lector = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()))) {

                    System.out.println("El resultat és: " + lector.readLine());
                }
            }
            socket.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
