package SistemaArchivos;

import java.time.LocalDate;

public class Archivo {
    private String nombre;
    private int tamanio;
    private LocalDate ultimaModificacion;
    private boolean leer;
    private boolean escribir;

    public Archivo(){
        this.nombre = "";
        this.tamanio = 0;
        this.ultimaModificacion = LocalDate.now();
        this.leer = false;
        this.escribir = false;
    }

    public Archivo(String nombre, int tamanio, LocalDate ultima){
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.ultimaModificacion = ultima;
        this.leer = false;
        this.escribir = false;
    }

    public Archivo(String nombre, int tamanio, LocalDate ultima, boolean leer, boolean escribir){
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.ultimaModificacion = ultima;
        this.leer = leer;
        this.escribir = escribir;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public LocalDate getUltimaModificacion() {
        return this.ultimaModificacion;
    }

    public void setUltimaModificacion(LocalDate ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }

    public boolean isLeer() {
        return this.leer;
    }

    public boolean getLeer() {
        return this.leer;
    }

    public void setLeer(boolean leer) {
        this.leer = leer;
    }

    public boolean isEscribir() {
        return this.escribir;
    }

    public boolean getEscribir() {
        return this.escribir;
    }

    public void setEscribir(boolean escribir) {
        this.escribir = escribir;
    }

}
