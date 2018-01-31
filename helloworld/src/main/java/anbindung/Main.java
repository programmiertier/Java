package anbindung;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main{
    public static void main(String args[]) throws IOException {
        ServerSocket anbindung = new ServerSocket(4711);
        System.out.println("Starte Lauschen");
        Socket sock = anbindung.accept();


        // Verbindung mit auslesen
        Scanner scan = new Scanner(sock.getInputStream());

        while (scan.hasNext()) {
            String command = scan.next();
            System.out.println(command);
            // 'ReadLine' in C#... command hier
            if (command.equals("EOF")) {
                break;
            }
        }

        System.out.println("Ende");
    }

}
