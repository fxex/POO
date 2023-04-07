package Parcial2020;

public class OpcionMultiple extends Pregunta{
    private String [] opciones;
    private int opcion;


    public OpcionMultiple() {
        super();
        opciones = new String[3];
        opcion = 0;
    }

    public OpcionMultiple(String enun, int num, String[]opc, int op) {
        super(enun,num);
        opciones = opc;
        opcion = op;
    }

    public OpcionMultiple(String enun, int num, String opcion1, String opcion2, String opcion3, int op) {
        super(enun,num);
        opciones = new String[3];
        opciones[0] = opcion1;
        opciones[1] = opcion2;
        opciones[2] = opcion3;
        opcion = op;
    }


    public String[] getOpciones() {
        return this.opciones;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }

    public int getOpcion() {
        return this.opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public String respuestaCorrecta(){
        return opciones[opcion];
    }

}
