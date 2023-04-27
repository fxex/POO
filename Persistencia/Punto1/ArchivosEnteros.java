package Persistencia.Punto1;

import java.io.*;


public class ArchivosEnteros {
    private RandomAccessFile archivo;
    public ArchivosEnteros(String nombre){
        try {
            archivo = new RandomAccessFile(nombre, "rw");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void metodoBurbuja(int[] a){
        int aux;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j+1]<a[j]) {
                    aux = a[j+1];
                    a[j+1] = a[j];
                    a[j] = aux;
                }
            }
        }
    }

    public void almacenarEntero(int n){
        try {
            if (archivo.length() == 0) {
                archivo.writeInt(n);
            } else{
                archivo.seek(archivo.length());
                archivo.writeInt(n);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarDatos(){
        try {
            archivo.seek(0);
            while (archivo.getFilePointer()< archivo.length()) {
                System.out.println(archivo.readInt());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean buscarDatos(int dato){
        boolean encontrado = false;
        int num=0;
        try {
            archivo.seek(0);
            while (archivo.getFilePointer()< archivo.length() && !encontrado) {
                num = archivo.readInt();
                if (num == dato) {
                    encontrado = true;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return encontrado;
    }

    public double calcularPromedio(){
        double promedio=0;
        try {
            archivo.seek(0);
            while (archivo.getFilePointer()< archivo.length()) {
                promedio += archivo.readInt();
            }
            promedio /= (int)(archivo.length()/4);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return promedio;
    }

    public void ordenarMayorMenor(){
        
        try {
            int[]vec = new int[(int)archivo.length()/4];
            int i = 0;
            archivo.seek(0);
            while (archivo.getFilePointer()< archivo.length()) {
                vec[i] = archivo.readInt();
                i++;
            }
            i=0;
            metodoBurbuja(vec);

            archivo.seek(0);
            while (archivo.getFilePointer()< archivo.length()) {
                archivo.writeInt(vec[i]);
                i++;
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /*Escriba un método que a los valores impares menores que 53, los actualice de manera que el valor almacenado se incremente en 2 unidades. Ejemplo: si el archivo contiene la siguiente secuencia: 19 6  22  99 56 35 101 48 37 luego de ejecutar el método queda: 21 6  22 99 37 10 48 39 */
    public void sumarDosImpares(){
        long ultimaPosicion = 0;
        int num = 0;
        try {
            archivo.seek(0);
            while (archivo.getFilePointer() < archivo.length()) {
                ultimaPosicion= archivo.getFilePointer();
                num = archivo.readInt();
                if (num<53 && !(num%2==0)) {
                    num += 2;
                    archivo.seek(ultimaPosicion);
                    archivo.writeInt(num);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
