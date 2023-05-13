package Sockets;
import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Cliente1 {
    public static void main(String[] args) {
        DataInputStream in;
        DataOutputStream out;
        Scanner sc = new Scanner(System.in);
        try {
            Socket cliente1 = new Socket("172.16.20.236", 4000);
            in = new DataInputStream(cliente1.getInputStream());
            out = new DataOutputStream(cliente1.getOutputStream());
            String mensaje = null;
            // while(mensaje.equals("44846450")){
            //     mensaje = sc.nextLine();
            //     out.writeUTF(mensaje);
            // }

            DataOutputStream dos = new DataOutputStream(cliente1.getOutputStream());
            DataInputStream dis = new DataInputStream(new FileInputStream("hola.txt"));

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = dis.read(buffer)) != -1) {
                dos.write(buffer, 0, bytesRead);
            }

            cliente1.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
