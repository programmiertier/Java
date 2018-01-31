package anbindung;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main{
    public static void main(String args[]) throws IOException {
        ServerSocket anbindung = new ServerSocket(4711);
        System.out.println("Starte Lauschen");
        Socket sock = anbindung.accept();


        System.out.println(sock.getInputStream());
        System.out.println("Ende");
    }

}
