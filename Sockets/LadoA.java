package Sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.*;

public class LadoA {
    public static void main(String[] args){
        try  {
            ServerSocket socket = new ServerSocket(4000);
            System.out.println("Esperando");
            Socket s = socket.accept();
            System.out.println("cliente conectado: " + s.getInetAddress().getHostAddress());

            // InputStream inputStream = s.getInputStream();
            // OutputStream outputStream = s.getOutputStream();

        }
        catch(Exception e){
            System.out.println("UWU");
        }
    }
}