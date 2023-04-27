package Persistencia.Punto4;

import java.io.*;

public class Persona implements Serializable{
    private String nombre;
    private int dni;
    private double altura;

    public Persona() {
        this.nombre ="";
        this.dni =0;
        this.altura =0;
    }

    public Persona(String nombre, int dni, double altura) {
        this.nombre =nombre;
        this.dni =dni;
        this.altura =altura;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
