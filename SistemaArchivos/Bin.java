package SistemaArchivos;

import java.time.LocalDate;

public class Bin extends Archivo{
    public Bin(){
        super();
    }

    public Bin(String nombre, int tamanio, LocalDate ultima){
        super(nombre, tamanio, ultima);
    }

    public Bin(String nombre, int tamanio, LocalDate ultima, boolean leer, boolean escribir){
        super(nombre, tamanio, ultima, leer, escribir);
    }
}
