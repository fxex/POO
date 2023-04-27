package Persistencia.Punto2;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ArchivosPersona {
    private RandomAccessFile archivo;
    private Persona p;
    public ArchivosPersona(){
        p = new Persona();
        try {
            archivo = new RandomAccessFile("data.dat", "rw");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArchivosPersona(String nombre){
        try {
            archivo = new RandomAccessFile(nombre, "rw");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }    

    public void agregarPersona(Persona p){
        String nombre = p.getNombre();
        int dni = p.getDni();
        double altura = p.getAltura();

        if (nombre.length() < 10) {
            nombre = String.format("%-10s",nombre);
        } else {
            nombre = nombre.substring(0, 9);
        }

        try {
            archivo.seek(archivo.length());
            archivo.writeInt(dni);
            archivo.writeUTF(nombre);
            archivo.writeDouble(altura);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public void mostrarDatos(){
        int i = 1;
        try {
            archivo.seek(0);
            while (archivo.getFilePointer() < archivo.length()) {
                System.out.println("Persona " + i);
                System.out.println(archivo.readInt());
                System.out.println(archivo.readUTF());
                System.out.println(archivo.readDouble());
                i++;
            }            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean buscarPersona(int d){
        int dni = 0;
        boolean b = false;
        try {
            archivo.seek(0);
            while (archivo.getFilePointer() < archivo.length() && !b){
                dni = archivo.readInt();
                if (dni == d) {
                    b = true;
                }
                archivo.skipBytes(20);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return b;
    }
    // 4 12 8
    public double promedioAltura(){
        double promedio = 0;
        double suma = 0;
        int contador = 0;
        try {
            archivo.seek(16);
            while (archivo.getFilePointer() < archivo.length()) {
                suma += archivo.readDouble();
                archivo.skipBytes(16);
                contador++;
            }

            promedio = suma / contador;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return promedio;
    }

    public void personasAltas(){
        ArchivosPersona aux = new ArchivosPersona("auxiliar.dat");
        Persona p;
        int dni = 0;
        double altura = 0;
        String nombre = null;

        try {
            archivo.seek(16);
            while (archivo.getFilePointer() < archivo.length()) {
                altura = archivo.readDouble();
                if (altura > 1.60) {
                    archivo.seek(archivo.getFilePointer()-24);
                    dni = archivo.readInt();
                    nombre = archivo.readUTF();
                    archivo.skipBytes(24);
                    p = new Persona(nombre, dni, altura);
                    aux.agregarPersona(p);
                } else {
                    archivo.skipBytes(16);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        aux.mostrarDatos();

    }



}
