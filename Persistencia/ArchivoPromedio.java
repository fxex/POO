package Persistencia;

import java.io.*;

public class ArchivoPromedio {
    private RandomAccessFile promedio;

    public ArchivoPromedio(String name){
        try {
            promedio = new RandomAccessFile(name, "rw");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public int cantidadMayoresa6 () {
        // calcula cuantos alumnos tienen promedio mayor a 6.
        float f = 0f;
        int cantidad=0;
        try {
            if (promedio.length() > 0 ) {
                promedio.seek(8);
            }
            while (promedio.getFilePointer() < promedio.length()) {
                f = promedio.readFloat();
                if (f>6) {
                    cantidad++;
                }
                promedio.seek(promedio.getFilePointer() + 8);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return cantidad;
    }

    public void reemplazarPromediosMenores3(){
        float prom = 0;
        try {
            if (promedio.length() > 0 ) {
                promedio.seek(8);
            }
            while (promedio.getFilePointer() < promedio.length()) {
                prom = promedio.readFloat();
                if (prom<3) {
                    promedio.skipBytes(-4);
                    promedio.writeFloat(0);
                }
                promedio.skipBytes(8);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
