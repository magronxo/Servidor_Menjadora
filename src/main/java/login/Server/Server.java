package login.Server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {


    static String host = "localhost";
    static int port = 9999;
    protected Socket socket;

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public void executa() {
        String usuari = "";
        String contrassenya = "";
        try {
            BufferedReader lector = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            usuari = lector.readLine();
            contrassenya = lector.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean resultat = checkCredentials(usuari, contrassenya);
        try {
            BufferedWriter escriptor = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream()));
            escriptor.write(String.valueOf(resultat));
            escriptor.newLine();
            escriptor.flush();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //El protocol per a la operació és operador:valor1:valor2
    private boolean checkCredentials (String usuari, String contrassenya) {
        //System.out.println("Usuari -" + usuari + "-");
        //System.out.println("Contrassenya -" + contrassenya + "-");
        if (usuari.equals("user") && contrassenya.equals("password") ){
            System.out.println("Credencials correctes");
            return true;
        } else {
            System.out.println("Credencials INcorrectes");
            return false;
        }
    }


    public static void main(String[] args) throws Exception {

        Server servidor = new Server();

        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("El servidor de credencials s'esta executant...");
        while (true) {
            System.out.println("Esperant clients ...");
            servidor.setSocket(serverSocket.accept());
            System.out.println("Client connectat");
            servidor.executa();
        }
        /*serverSocket.close();
        System.out.println("El servidor matemàtic s'ha tancat...");*/


    }
}
