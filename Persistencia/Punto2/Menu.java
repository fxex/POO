package Persistencia.Punto2;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ArchivosPersona a = new ArchivosPersona("data.dat");
        a.mostrarDatos();
        a.personasAltas();
    }
}