package Parcial2020;

public class Pregunta{
    private String enunciado;
    private int numero;

    public Pregunta(){
        this.enunciado = "";
        this.numero = 0;
    }

    public Pregunta(String enunciado, int num){
        this.enunciado = enunciado;
        this.numero = num;
    }


    public String getEnunciado() {
        return this.enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    @Override
    public String toString() {
        return "numero='" + getNumero() + "'" +
            " enunciado='" + getEnunciado() + "'";
    }
    
}