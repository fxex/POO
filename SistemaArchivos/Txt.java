package SistemaArchivos;

import java.time.LocalDate;

public class Txt extends Archivo{
    public Txt(){
        super();
    }

    public Txt(String nombre, int tamanio, LocalDate ultima){
        super(nombre, tamanio, ultima);
    }

    public Txt(String nombre, int tamanio, LocalDate ultima, boolean leer, boolean escribir){
        super(nombre, tamanio, ultima, leer, escribir);
    }
}
