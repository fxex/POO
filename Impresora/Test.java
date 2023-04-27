package Impresora;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Printer impresora = new Printer();
        Document d;
        do {
            System.out.println("----------");
            
            System.out.println("1.");
            System.out.println("0. ");
            
            System.out.println("------------");

            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            
        } while (opcion == 0);
    }
}
